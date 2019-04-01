package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class StudentConfig {

    private Students students;

    @Bean(name = "currentStudents")
    public Students currentStudents()
    {
        return new Students(new Student(01l, "Laxmi"),
                new Student(02l, "Suchi"),
                new Student(03l, "Nirmala"),
                new Student(04l, "Swapna"));
    }


    @Bean(name = "previousStudents")
    public Students previousStudents()
    {
        return new Students(new Student(01l, "Tulasi"),
                new Student(02l, "Merin"),
                new Student(03l, "Connor"));
    }

}
