package com.example.demo;


public class Instructors extends People<Instructor> {
    private Instructor instructor;

    public Instructors (Instructor...instructors){
        super(instructors);
        //instructorList=new ArrayList<Instructor>();
    }
//
//    public Instructors(Instructor instructor)
//    {
//        this.instructor=instructor;
//    }


}
