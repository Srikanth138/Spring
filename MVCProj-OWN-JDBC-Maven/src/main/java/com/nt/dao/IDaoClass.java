package com.nt.dao;

import java.sql.SQLException;
import java.util.List;

import com.nt.model.Model;

public interface IDaoClass {
	public List<Model> dao(String name) throws SQLException;

}
