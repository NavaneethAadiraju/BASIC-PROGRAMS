package com.ojas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.EmployeeRepository;
import com.ojas.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public List<Employee> findAll() {

		return emprepo.findAll();
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		emprepo.save(theEmployee);
	}

	@Override
	public void deletebyId(Long theId) {
		// TODO Auto-generated method stub
		emprepo.deleteById(theId);
	}

}
