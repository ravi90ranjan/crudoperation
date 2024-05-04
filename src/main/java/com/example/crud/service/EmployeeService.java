package com.example.crud.service;

import com.example.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> fetchAllEmployee();
    Employee getEmployeeById(Long id);
    Employee updateEmployeeById(Long id,Employee employee);
    String deleteEmployeeById(Long id);

}
