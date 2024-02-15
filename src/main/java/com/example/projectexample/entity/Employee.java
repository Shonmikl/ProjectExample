package com.example.projectexample.entity;

import com.example.projectexample.entity.enums.Position;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
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
@Table(name = "employees")
@NoArgsConstructor
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "sur_name")
    private String surName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "salary")
    private double salary;

    @Enumerated(EnumType.STRING)
    @Column(name = "position")
    private Position position;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Department department;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name)
                && Objects.equals(surName, employee.surName)
                && Objects.equals(email, employee.email)
                && Objects.equals(phoneNumber, employee.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, email, phoneNumber);
    }
}
