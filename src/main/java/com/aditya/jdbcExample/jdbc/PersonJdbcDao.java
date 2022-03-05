package com.aditya.jdbcExample.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aditya.jdbcExample.entity.Person;

@Repository 
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Person> findAll() {
		
		return jdbcTemplate.query("Select * from Person",new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	
}
