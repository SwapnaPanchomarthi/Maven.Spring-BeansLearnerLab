package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Student  extends Person implements Learner{
    private double totalStudyTime;


    public Student(long id, String name) {
        super(id, name);
    }
    public Student(){
        super(0l, "");
        this.totalStudyTime=0.0;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "totalStudyTime=" + totalStudyTime +
//                '}';
//    }

    @Override
    public void learn(double numberOfHours) {
    totalStudyTime+=numberOfHours;
    }

    public double getTotalStudyTime()
    {
        return totalStudyTime;
    }
}
