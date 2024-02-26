package com.example.projectexample.controller;

import com.example.projectexample.entity.Department;
import com.example.projectexample.service.inter.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dep")
@RequiredArgsConstructor
public class DepartmentController {

//    @GetMapping("/get")
//    public String  get() {
//        return "!!!!!!!!!!!";
//    }

    private final DepartmentService departmentService;

    @GetMapping("/getAll")
    public List<Department> getAllDepartments() {
        return departmentService.getAll();
    }
}