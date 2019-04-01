package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner
{
    public static void main(String[] args) {
        ApplicationContext factory=new AnnotationConfigApplicationContext(InstructorsConfig.class);
        Instructors instructors = factory.getBean(Instructors.class);
        System.out.println(instructors);

        ApplicationContext factoryStudent=new AnnotationConfigApplicationContext(StudentConfig.class);
        Students students = factoryStudent.getBean(Students.class);
        System.out.println(students);
    }
}
