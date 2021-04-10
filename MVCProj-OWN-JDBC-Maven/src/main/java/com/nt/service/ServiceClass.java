package com.nt.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IDaoClass;
import com.nt.model.Model;

@Service
public class ServiceClass implements IServiceClass {
	@Autowired
	IDaoClass d;

	@Override
	public List<Model> service(String name) throws SQLException {
		// IDaoClass d=new DaoClass();
		System.out.println("ServiceClass.service()");
		List<Model> a=d.dao(name);
		return a;
	}

}
