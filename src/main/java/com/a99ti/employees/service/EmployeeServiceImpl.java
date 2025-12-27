package com.a99ti.employees.service;

import com.a99ti.employees.dao.EmployeeDAO;
import com.a99ti.employees.dao.EmployeeDAOJpaImpl;
import com.a99ti.employees.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDao){
        employeeDAO = theEmployeeDao;
    }


    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
