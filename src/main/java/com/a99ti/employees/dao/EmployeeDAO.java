package com.a99ti.employees.dao;

import com.a99ti.employees.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
