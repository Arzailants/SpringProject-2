package com.example.belajar.spring.demo.Repository;

import com.example.belajar.spring.demo.entity3.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {

    int count();
    int save(Employee employee);
    int update(Employee employee);
    int deleteById(Long id);

    List<Employee> findAll();
    List<Employee> findByLastName(String lastName);
    Optional<Employee> findById(Long id);
}
