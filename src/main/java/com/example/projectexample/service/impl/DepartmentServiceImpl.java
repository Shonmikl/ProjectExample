package com.example.projectexample.service.impl;

import com.example.projectexample.entity.Department;
import com.example.projectexample.repository.DepartmentRepository;
import com.example.projectexample.service.inter.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }
}