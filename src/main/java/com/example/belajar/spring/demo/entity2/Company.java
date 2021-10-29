package com.example.belajar.spring.demo.entity2;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class Company {

    // MEMBUAT ATTRIBUT
    private Address address;

}
