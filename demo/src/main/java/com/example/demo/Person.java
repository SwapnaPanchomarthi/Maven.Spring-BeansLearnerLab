package com.example.demo;

public class Person {

    public void setId(long id) {
        this.id = id;
    }

    private  long id;
    private String name;

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(long id, String name) {
        this.id = id;
        this.name=name;
    }
}