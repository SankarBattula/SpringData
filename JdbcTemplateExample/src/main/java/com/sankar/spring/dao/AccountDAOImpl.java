package com.sankar.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sankar.spring.constants.QueryConstants;

public class AccountDAOImpl implements IAccountDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void create() {
		jdbcTemplate.update(QueryConstants.CREATE_QUERY);
		
	}
	
	
	

}
