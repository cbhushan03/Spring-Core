package com.tutorial.cbt.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tutorial.cbt.model.Employee;
@Component
public class JdbcDaoImpl {
	
	@Autowired
	DataSource dataSource;
	
	public Employee getEmployee(int eid){
		Connection conn = null;
		Employee emp = null;
		try{
		/*String driver ="oracle.jdbc.driver.OracleDriver";
		
		//Class.forName(driver).newInstance();
		
		Driver myDriver = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(myDriver);
		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.255.128:1521:xe", "HR","hr");*/
			
		conn= dataSource.getConnection();
		
		PreparedStatement ps = conn.prepareStatement("select * from employees where EMPLOYEE_ID = ?");
		ps.setInt(1, eid);
		
		
		
		ResultSet rs = ps.executeQuery();
			while(rs.next()){
				emp = new Employee(eid, rs.getString("FIRST_NAME"),rs.getString("LAST_NAME"), rs.getString("EMAIL"));
			}
			
		rs.close();
		ps.close();
		return emp;
		
		}catch (Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException ex){
				ex.printStackTrace();
			}
		}
		return emp;
	}
	
	
	public Employee getEmployee_Mysql(int eid){
		Connection conn = null;
		Employee emp = null;
		try{
		/*String driver ="oracle.jdbc.driver.OracleDriver";
		
		//Class.forName(driver).newInstance();
		
		Driver myDriver = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(myDriver);
		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.255.128:1521:xe", "HR","hr");*/
			
		conn= dataSource.getConnection();
		
		PreparedStatement ps = conn.prepareStatement("select * from employees where EMP_no = ?");
		ps.setInt(1, eid);
		
		
		
		ResultSet rs = ps.executeQuery();
			while(rs.next()){
				emp = new Employee(eid, rs.getString("FIRST_NAME"),rs.getString("LAST_NAME"), rs.getString("last_name"));
			}
			
		rs.close();
		ps.close();
		return emp;
		
		}catch (Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException ex){
				ex.printStackTrace();
			}
		}
		return emp;
	}
}
