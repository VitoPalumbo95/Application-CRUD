package com.example.Spring.boot.Project.repository;

import com.example.Spring.boot.Project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findEmployeeById(Long id);

    void deleteEmployeeById(Long id);

    Employee findEmployeeByName(String name);
}
