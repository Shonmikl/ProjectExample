package com.example.projectexample.mapper;

import com.example.projectexample.dto.EmployeeDTO;
import com.example.projectexample.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeeMapper {

    @Mapping(target = "salary", qualifiedByName = "updater")
    Employee toEntity(EmployeeDTO employeeDTO);

//    @Named("updater")
//    private double updater() {
//
//    }
}
