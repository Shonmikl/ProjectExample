package com.example.projectexample.service.impl;

import com.example.projectexample.dto.EmployeeDTO;
import com.example.projectexample.entity.Employee;
import com.example.projectexample.mapper.EmployeeMapper;
import com.example.projectexample.repository.EmployeeRepository;
import com.example.projectexample.service.inter.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public Employee createE(EmployeeDTO employeeDTO) {

        Employee employee = employeeRepository.findByPhoneNumber(employeeDTO.getPhoneNumber());
        if(employee == null) {
            employee = employeeMapper.toEntity(employeeDTO);
            employeeRepository.save(employee);
        }
        return employee;
    }
}
