package com.example.Spring.boot.Project.service;

import com.example.Spring.boot.Project.entity.Employee;
import com.example.Spring.boot.Project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepository.findEmployeeById(id);
    }

    public Employee findEmployeeByName(String name){
        return employeeRepository.findEmployeeByName(name);
    }

    @Transactional
    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }

}
