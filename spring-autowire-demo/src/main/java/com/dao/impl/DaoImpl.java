package com.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static String STR="Dao impl";
	private static final String QUERY="select * from person";
	public String get() {
		if(null!=jdbcTemplate) {
			System.out.println("Connection Created");
		}else {
			System.out.println("Not created");
		}
		int id=1;
		List<Person> person= jdbcTemplate.query(QUERY,new Object[]{}, new PersonRowMapper());
		System.out.println(person);
		return STR;
	}

}

class Person{
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
}
