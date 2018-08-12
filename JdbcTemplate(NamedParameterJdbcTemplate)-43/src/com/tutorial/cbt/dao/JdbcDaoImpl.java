package com.tutorial.cbt.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.tutorial.cbt.model.Countries;
import com.tutorial.cbt.model.Employee;
@Component
public class JdbcDaoImpl {
	
	
	DataSource dataSource;
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	NamedParameterJdbcTemplate nameJdbcTemplate ;
	
	
	
	public int getEmpCount(){
		String query = "select count(*) from employees";
		return jdbcTemplate.queryForInt(query);
	}
	
	public String getEmpName(int eid){
		String query="select FIRST_NAME from employees where EMPLOYEE_ID = ?";
		
		return jdbcTemplate.queryForObject(query, new Object[]{eid},String.class);
	}
	
	public Employee getEmpDetails(int eid){
         String query="select * from employees where EMPLOYEE_ID = ?";
		
		return jdbcTemplate.queryForObject(query, new Object[]{eid},new EmployeeMapper());
	}
	
	
	public List<Employee> getAllEmpDetails(){
		String query="select * from employees";
		
		return jdbcTemplate.query(query, new EmployeeMapper());
	}
	
	public void insertCountry(Countries country){
		String query="Insert into COUNTRIES (COUNTRY_ID,COUNTRY_NAME,REGION_ID) values (?,?,?)";
	
		jdbcTemplate.update(query, new Object[]{country.getCid(),country.getCname(),country.getRegion()});
	}
	
	
	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.nameJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public static final class EmployeeMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
			
			Employee emp = new Employee();
			emp.setEid(rs.getInt("EMPLOYEE_ID"));
			emp.setfName(rs.getString("FIRST_NAME"));
			emp.setlName(rs.getString("LAST_NAME"));
			emp.setEmail(rs.getString("EMAIL"));
			return emp;
		}
		
	}
	
	
}
