package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.impl.DaoImpl;

@Service
public class ServiceImpl {
	@Autowired
	private DaoImpl dao;
	
	public void get() {
		System.out.println(dao.get());
	}
}
