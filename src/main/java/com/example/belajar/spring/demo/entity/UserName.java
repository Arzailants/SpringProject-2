package com.example.belajar.spring.demo.entity;

public class UserName {

    // MEMBUAT ATTRIBUT
    private String name;
    private String address;

    // MEMBUAT GETTER DAN SETTER
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
