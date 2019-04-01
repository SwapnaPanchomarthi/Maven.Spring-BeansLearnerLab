package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestClassroomConfig {

    @Autowired @Qualifier("currentCohort")
    Classroom currentCohort;

    @Autowired @Qualifier("previousCohort")
    Classroom previousCohort;

    @Test
    public void currentCohortTest()
    {
        //Given
        String expectedStudents = "ID: 0  Name: Swapna\n" +
                                  "ID: 1  Name: Lakshmi\n" +
                                  "ID: 2  Name: Shuchi\n" +
                                   "ID 3  Name: Sravani\n"+
                                    "ID 4 Name: Nirmala\n";

        String expectedInstructors = "ID: 1  Name: Leon\n" +
                "ID: 2  Name: Froilan\n";

        //When
        String actualStudents=currentCohort.getStudents().toString();
        System.out.println(actualStudents);
        String actualInstructors = currentCohort.getInstructors().toString();
        System.out.println(actualInstructors);
    }

    @Test
    @Autowired @Qualifier("previousCohort")
    public void previousCohortTest(){

        //Given
//        String expectedStudents = "ID: 0  Name: Merin\n" +
//                "ID: 1  Name: Connor\n" +
//                "ID: 2  Name: Whitney\n" ;
//
//        String expectedInstructors = "ID: 1  Name: Nhu\n" +
//                "ID: 2  Name: Wilhem\n";

        //When
        String actualStudents=previousCohort.getStudents().toString();
        System.out.println(actualStudents);
        String actualInstructors = previousCohort.getInstructors().toString();
        System.out.println(actualInstructors);


    }
}
