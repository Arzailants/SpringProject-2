package com.example.belajar.spring.demo.entity3;


import lombok.*;

// MEMBUAT CONSTRUCTOR, GETTER DAN SETTER DAN TOSTRING DENGAN BANTUAN LOMBOK
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    // MEMBUAT ATTRIBUT
    private Long employeeId;
    private String lastName;
    private String firstName;
    private String address;
    private String city;


}
