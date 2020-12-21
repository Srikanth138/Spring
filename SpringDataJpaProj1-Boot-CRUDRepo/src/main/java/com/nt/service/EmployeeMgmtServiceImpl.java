package com.nt.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.EmployeeDTO;
import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepo;

@Service("empService") // use in main class
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired //ByType,ByName, constractor ,default
	private  IEmployeeRepo  empRepo;

	@Override
	public int registerEmployee(EmployeeDTO dto) {
		
		//convert  dto to Entity
		Employee entity=new Employee();
		
		//copy dto class data TO DB table class
		BeanUtils.copyProperties(dto, entity);
		System.out.println(empRepo.getClass()+" "+Arrays.toString(empRepo.getClass().getInterfaces())+"  "+Arrays.toString(empRepo.getClass().getDeclaredMethods()));
		//use  empRepo
		/*Employee entity1=empRepo.save(entity);
		return entity1.getEno();*/
		
		//<S extends T> S save(S entity);
		return  empRepo.save(entity).getEno();
	}//method

	
	@Override
	public int[] registerEmployeesGroup(List<EmployeeDTO> listDTO) {
		
		//convert listDTO to ListEntity obj
		  List<Employee> listEntity=new ArrayList();
		 listDTO.forEach(dto->{
			 Employee entity=new Employee();
			 BeanUtils.copyProperties(dto, entity);
			 listEntity.add(entity);
		 });
		 
		 //use   empRepo
		 List<Employee> listEntity1=(List<Employee>) empRepo.saveAll(listEntity);
		 //gathers ids of  saved objects
		int ids[]=new int[listEntity1.size()]; 
		for(int i=0;i<listEntity1.size();++i) {
			ids[i]=listEntity1.get(i).getEno();
		}
		return ids;
	}//method
	
	
	
	
	//-> 
	/*
	  @Override
	public long getEmployeesCount() {
		//use empRepo
		return empRepo.count();
	}
	
	@Override
	public String removeEmployeeById(int id) {
		//use empRepo
		  if(empRepo.existsById(id)) {
			  empRepo.deleteById(id);
			  return  id+"  employee is deleted";
		  }
		  else
			  return id+"  employee is not deleted";
	}
	
	@Override
	public Optional<EmployeeDTO> getEmployeeById(int id) {
		//use empRepo
		Optional<Employee> opt=empRepo.findById(id);
		
		Optional optDTO=Optional.empty();
		if(opt.isPresent()) {
			//get Entity obj
			Employee entity=opt.get();
			//covert to DTO
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(entity,dto);
			optDTO=Optional.of(dto);
		}
		return optDTO;
	}//method
	
	@Override
	public String removeEmployeeById1(int id) {
		//use  repo;
		Optional<Employee> opt=empRepo.findById(id);
		if(opt.isPresent()) {
			empRepo.delete(opt.get());
			return  "Employee deleted";
		}
		else {
		     return "Employee not found to delete";	
		}
		
	}//method
	
	@Override
	public Iterable<EmployeeDTO> getAllEmployees() {
		//use Repo
		Iterable<Employee> itEntities= empRepo.findAll();
		Iterable<EmployeeDTO> itDTOs=new ArrayList();
		itEntities.forEach(entity->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(entity,dto);
			((List<EmployeeDTO>) itDTOs).add(dto);
		});
		return itDTOs;
	}
	
	@Override
	public String removeEmployeesByGivenEntities(List<EmployeeDTO> listDTOs) {
		//convert listDTOs to listEntities
		List<Employee> listEntities=new ArrayList();
		listDTOs.forEach(dto->{
			Employee entity=new Employee();
			BeanUtils.copyProperties(dto, entity);
			listEntities.add(entity);
		});
		     empRepo.deleteAll(listEntities);
		     return  "Multiple Employees are deleted";
	}//method
	
	@Override
	public List<EmployeeDTO> getEmployeesByIds(List<Integer> ids) {
		//use empRepo
		List<Employee> listEntities=(List<Employee>) empRepo.findAllById(ids);
		//convert listEntities to listDTOs
		List<EmployeeDTO> listDTOs=new ArrayList();
		listEntities.forEach(entity->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(entity, dto);
			listDTOs.add(dto);
		});
		
		return listDTOs;
	} */
}//class 

