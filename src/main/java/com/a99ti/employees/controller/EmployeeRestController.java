package com.a99ti.employees.controller;

import com.a99ti.employees.dao.EmployeeDAO;
import com.a99ti.employees.entity.Employee;
import com.a99ti.employees.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@Tag(name = "Employee Rest API Endpoint", description = "Operations related to Employees")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @Operation(summary = "Get all employees", description = "Retrieve a list of all employees")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    @Operation(summary = "Fetch single employee", description = "Get a single employee from database")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{employeeId}")
    public Employee getEmployee(@PathVariable @Min(value = 1) long employeeId){
        Employee theEmployee = employeeService.findById(employeeId);
        return theEmployee;
    }


}
