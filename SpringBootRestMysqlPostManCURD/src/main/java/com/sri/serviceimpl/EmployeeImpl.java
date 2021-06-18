package com.sri.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sri.exception.ResourceNotFoundException;
import com.sri.model.Employee;
import com.sri.repository.RepositoryImpl;
import com.sri.service.IEmployeeService;

@Service
public class EmployeeImpl implements IEmployeeService {

	// no need to write @Autowired Annotation 100% inject we can use constructor
	private RepositoryImpl repo;

	public EmployeeImpl(RepositoryImpl repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Employee saveEmployee(Employee e) {
		return repo.save(e);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	public Optional<Employee> getEmpById(Integer id) {
		Optional<Employee> emp = repo.findById(id);
		return emp;
	}

	@Override
	public Employee getEmpById2(Integer id) {// #2
//		Optional<Employee> emp = repo.findById(id);
		/*
		 * if (emp.isPresent()) { return emp.get(); } else { throw new
		 * ResourceNotFoundException("Employee", "Id", id); }
		 */
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
	}

	@Override
	public Employee updateEmp(Employee emp, Integer id) {
		Employee existingEmployee = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));

		existingEmployee.setName(emp.getName());
		existingEmployee.setEmail(emp.getEmail());
		existingEmployee.setAddr(emp.getAddr());
		// save existing Employee to DB

		return repo.save(existingEmployee);
	}

	@Override
	public void deleteEmpId(Integer id) {
		repo.deleteById(id);
	}
}
