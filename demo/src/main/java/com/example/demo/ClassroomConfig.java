package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class ClassroomConfig {

    @Bean (name ="currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students)
    {
    return new Classroom(instructors, students);
    }

    @Bean (name ="previousCohort")
    @DependsOn({"instructors", "students"})
    public Classroom previousCohort(Instructors instructors, Students students)
    {
        return new Classroom(instructors, students);
    }
}
