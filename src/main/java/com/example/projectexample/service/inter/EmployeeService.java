package com.example.projectexample.service.inter;

import com.example.projectexample.dto.EmployeeDTO;
import com.example.projectexample.entity.Employee;

public interface EmployeeService {
    Employee createE(EmployeeDTO employeeDTO);
}