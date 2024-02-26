package com.example.projectexample.repository;

import com.example.projectexample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByPhoneNumber(String pn);
}
