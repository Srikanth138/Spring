package com.sri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sri.model.Employee;

//no need to add @Repository already is there in the JpaRepository
public interface RepositoryImpl extends JpaRepository<Employee, Integer> {

}
