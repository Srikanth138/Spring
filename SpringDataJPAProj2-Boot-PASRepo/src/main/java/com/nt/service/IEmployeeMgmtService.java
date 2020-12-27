package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
	//#1
	public   List<EmployeeDTO>  getAllEmployeesBySorting(String property, boolean asc);
	
	//#2
	public   List<EmployeeDTO>  getAllEmployeesBySorting(boolean asc,String ...properties);
	
	//#3
    public   List<EmployeeDTO>  getPageRecords(int pageNo,int pageSize);
	
	//#4
    public    void getRecordsByPagination(int pageSize);
}
