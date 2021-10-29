package com.example.belajar.spring.demo.Repository;

/*
Beberapa orang memanggil implementasi sebagai DAO Service class
 */

import com.example.belajar.spring.demo.entity3.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

public class EmployeeImpl implements EmployeeRepository{


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return jdbcTemplate.queryForObject("select count(*) from employee", Integer.class);
    }

    @Override
    public int save(Employee employee) {
        return jdbcTemplate.update("UPDATE INTO PUBLIC.employee(lastname, firstname, address, city) values(?,?,?,?)",
                employee.getLastName(),
                employee.getFirstName(),
                employee.getAddress(),
                employee.getCity()
                );
    }

    @Override
    public int update(Employee employee) {
        return jdbcTemplate.update("UPDATE employee set lastname=?, firstname=?, address=?, city=? where employeeId=?",
        employee.getLastName(),
        employee.getFirstName(),
        employee.getAddress(),
        employee.getCity(),
        employee.getEmployeeId()
        );
    }

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("delete from employee where employeeId=?", id);
    }

    @Override
    public List<Employee> findAll() {
        return jdbcTemplate.query("select * from employee", ((rs, rowNum) ->
                new Employee(
                        rs.getLong("employeeId"),
                        rs.getString("lastname"),
                        rs.getString("firstname"),
                        rs.getString("address"),
                        rs.getString("city")
                )));
    }

    @Override
    public List<Employee> findByLastName(String lastName) {
        return null;
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return Optional.empty();
    }
}
