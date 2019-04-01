package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SuppressWarnings("ALL")
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors usaInstuctors;

    @Autowired
    @Qualifier("tcUKInstructors")
    Instructors ukInstructors;

    @Test
    public void tcUsaInstructorsTest() {
        // Given
        String expected = "ID: 1  Name: USA Instructor #1\n" +
                "ID: 2  Name: USA Instructor #3\n";

        // When
        String actual = usaInstuctors.toString();
        System.out.println(actual.toString());

        // Then
        // Assert.assertEquals(expected, actual);
    }

    @Test
    public void tcUKInstructorsTest() {
        // Given
        String expected = "ID: 1  Name: USA Instructor #1\n" +
                "ID: 2  Name: USA Instructor #3\n" +
                "ID: 3  Name: USA Instructor #3\n";

        // When
        String actual = ukInstructors.toString();
        System.out.println(actual.toString());

    }
}
