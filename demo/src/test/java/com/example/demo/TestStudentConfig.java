package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)

public class TestStudentConfig {

    @Autowired @Qualifier("currentStudents")
    Students currentStudents;

    @Autowired@Qualifier("previousStudents")
    Students previousStudents;

    @Test
    public void testCurrentStudentsLength() {
        //Given
        int expected = 4;

        //When
        int actual = currentStudents.size();
        System.out.println(currentStudents.toString());


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStudentsnames() {
        //Given
    //When

        System.out.println(currentStudents.toString());



        //Then
      //  Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStudentsLenght(){
        //Given
        int expected=3;

        //When
        int actual =previousStudents.size();
        System.out.println(actual);

    }
}
