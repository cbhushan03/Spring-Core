package com.cbt.dao;

import java.sql.Types;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.cbt.bean.Company;


@Repository
public class CompanyDao {
	
	private SimpleJdbcCall simpleJdbcCall ;

	@Autowired
    public void setDataSource(DataSource dataSource) {
       //this.simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("HR.read_company");
    
       JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
       jdbcTemplate.setResultsMapCaseInsensitive(true);
       this.simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("read_company").withoutProcedureColumnMetaDataAccess();
       simpleJdbcCall.compile();
	}
	
	public Company getCompany(int C_ID){
		MapSqlParameterSource  in = new MapSqlParameterSource().addValue("in_id", 0001);
		Map<String,Object> out = simpleJdbcCall.execute(in);
		Company comp = new Company();
		
		comp.setName((String)out.get("out_name"));
		comp.setLocation((String)out.get("out_location"));
		comp.setNoOfEmp((Integer)out.get("out_no_emp"));
		
		return comp;
	}
	
	
}