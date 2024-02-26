package com.example.projectexample.service.impl;

import com.example.projectexample.dto.EmployeeDTO;
import com.example.projectexample.entity.Employee;
import com.example.projectexample.repository.EmployeeRepository;
import com.example.projectexample.service.inter.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee createE(EmployeeDTO employeeDTO) {
        String phoneNumber = employeeRepository.findByPhoneNumber(employeeDTO.getPhoneNumber()).getPhoneNumber();
        if(phoneNumber == null) {
            employeeRepository.save()
        }
        return null;
    }
}
