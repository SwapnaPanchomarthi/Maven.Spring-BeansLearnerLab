package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InstructorsConfig
{

    private Instructors instructors;
//    private static Instructor[] USInstructors = new Instructor[3];
//    private static String[] USInstructorsName = new String[]{"Leon", "Kris","Melanie"};
//    private static Instructor[] UKInstructors = new Instructor[2];
//    private static String[] UKInstructorsName = new String[]{"Wilhem", "Dollio"};
//    private static Instructor[] ZCWInstructors = new Instructor[4];
//    private static String[] ZCWInstructorsName = new String[]{"Nhu", "Sian","Froilan", "Nancy"};
//
//    static {
//        for (int i = 0; i < 5; i++) {
//            ZCWInstructors[i] = new Instructor(i, ZCWInstructorsName[i]);
//            if (i < 4) {
//                UKInstructors[i] = new Instructor(i, UKInstructorsName[i]);
//            }
//            if (i < 3) {
//                USInstructors[i] = new Instructor(i, USInstructorsName[i]);
//            }
//        }
//    }



    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors()
    {
        return new Instructors(new Instructor(001,"Leon"),
                new Instructor(002, "Nhu"));



    }

    @Bean(name= "tcUKInstructors")
    public Instructors tcUKInstructors()
    {
        return new Instructors(new Instructor(003,"Wilhem"),
                new Instructor(004, "Kris"),
                new Instructor(007, "Sian"));
    }

    @Primary
    @Bean
    public Instructors instructors(){
        return new Instructors(new Instructor(005, "Froilan"),
                                new Instructor(006, "Dollio"),
                                new Instructor(011, "Melanie"),
                                new Instructor(0010, "Dan"));

    }
}
