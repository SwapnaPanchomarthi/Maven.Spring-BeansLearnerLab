package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAlumni {

    @Autowired
    Alumni alumni;

  @Test
  public void testLearned1200() {
      //Given
      double expected = 1200;

      //Then
      Students students=alumni.getStudents();

      System.out.println(students);
      students.forEach(student -> Assert.assertEquals(expected, student.getTotalStudyTime(), 0.1));
  }
}
