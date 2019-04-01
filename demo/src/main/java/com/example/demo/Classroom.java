package com.example.demo;

import java.util.ArrayList;
import java.util.List;


public class Classroom {
    private Instructors instructors;
    private Students students;
   // private List<Person> personList;

    public Classroom(Instructors instructors, Students students)
    {
        this.instructors=instructors;
        this.students=students;
    }


    public void hostLecture(Teacher teacher, double numerOfHours) {
       // personList = new ArrayList<Person>();
            teacher.lecture(students, numerOfHours);


    }


    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }



}
