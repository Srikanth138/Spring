package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.repository.IDepartmentRepo;
import com.nt.repository.IEmployeeRepo;

@Service("compService")
public class CompanyMgmtServiceImpl implements ICompanyMgmtService {

	@Autowired
	private IDepartmentRepo deptRepo;
	@Autowired
	private IEmployeeRepo empRepo;

	@Override
	public List<Object[]> fetchJoinsDataParentToChild() {
		List<Object[]> list = deptRepo.getJoinsDataParentToChild();
		return list;
	}

	@Override
	public List<Object[]> fetchJoinsDataChildToParent() {
		List<Object[]> list = empRepo.getJoinsDataChildToParent();
		return list;
	}

}
