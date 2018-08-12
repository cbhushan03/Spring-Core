package com.tutorial.cbt.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.tutorial.cbt.model.Employee;
@Component
public class JdbcDaoImpl {
	
	
	DataSource dataSource;
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	
	public Employee getEmployee(int eid){
		Connection conn = null;
		Employee emp = null;
		try{
		
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

	
	public int getEmpCount(){
		String query = "select count(*) from employees";
		return jdbcTemplate.queryForInt(query);
	}
	
	public String getEmpName(int eid){
		String query="select FIRST_NAME from employees where EMPLOYEE_ID = ?";
		
		return jdbcTemplate.queryForObject(query, new Object[]{eid},String.class);
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
}
