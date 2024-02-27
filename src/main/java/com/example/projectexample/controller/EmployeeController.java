package com.example.projectexample.controller;

import com.example.projectexample.dto.EmployeeDTO;
import com.example.projectexample.entity.Employee;
import com.example.projectexample.service.inter.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empl")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PutMapping("/create")
    public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createE(employeeDTO);
    }

    /**
     * Напиши метод который обновляет почту у нашего Employee с EmployeeDTO
     * Далее:
     *
     * - запустите программу
     * - создайте Employee (он будет со значением по умолчанию 1000 (salary))
     * - в БД обновите зп (например 9999) через SQL запрос
     * - обновите Employee (с новой почтой)
     *
     * 1, Надо понять засетится ли старой значение зарпалты или нет\
     * 2, Надо понять есть ли разница при обновлении ПУТ или ПОСТ запросом
     */
}