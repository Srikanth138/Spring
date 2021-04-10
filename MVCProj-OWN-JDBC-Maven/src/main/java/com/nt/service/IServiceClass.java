package com.nt.service;

import java.sql.SQLException;
import java.util.List;

import com.nt.model.Model;

public interface IServiceClass {
	public List<Model> service(String name) throws SQLException;

}
