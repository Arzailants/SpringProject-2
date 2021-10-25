package com.example.belajar.spring.demo.entity;

public class Todo {

    // MEMBUAT ATTRIBUT
    private Long userId;
    private Long id;
    private String title;
    private Boolean completed;

    // MEMBUAT CONSTRUCTOR
    public Todo(){

    }

    // MEMBUAT GETTER DAN SETTER
    public Long getUserId(){
        return userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Boolean getCompleted(){
        return completed;
    }

    public void setCompleted(Boolean completed){
        this.completed = completed;
    }


    // OVERRIDE TO STRING
    @Override
    public String toString(){
        return "Todo{" +
                "userId=" +userId+
                "id=" +id+
                "title=" +title+
                "completed=" +completed+
                "}";
    }

}
