package com.example.projectexample.entity;

import com.example.projectexample.entity.enums.Position;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;

/**
 * -Аннотация @Entity. Класс, который представляет сущность,
 * должен быть помечен аннотацией @Entity.
 * -Присутствие первичного ключа (@Id). У сущности должно быть поле,
 * которое является первичным ключом.
 * -Это поле должно быть помечено аннотацией @Id.
 * -Пустой конструктор. Класс сущности должен иметь пустой конструктор.
 * Hibernate использует его для создания объектов при чтении из базы данных.
 * -Геттеры и сеттеры для всех полей.
 * Чтобы Hibernate мог правильно установить значения полей и
 * получить их при работе с объектами, должны быть предоставлены
 * геттеры и сеттеры для всех полей сущности.
 * -Соответствие типов данных.
 * Типы полей сущности должны соответствовать типам данных в базе данных.
 */

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Employee {

    @Id
    private int id;
    private String name;
    private String surName;
    private String email;
    private String phoneNumber;
    private double salary;

    private Position position;
    private Set<Employee> subordinates;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surName, employee.surName) && Objects.equals(email, employee.email) && Objects.equals(phoneNumber, employee.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, email, phoneNumber);
    }
}
