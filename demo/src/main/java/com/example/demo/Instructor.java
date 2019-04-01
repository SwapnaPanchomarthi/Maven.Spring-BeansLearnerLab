package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


public class Instructor extends Person implements Teacher {


    @Autowired
   public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        List<Learner> learnerList = new ArrayList<>();
        learners.forEach(learner -> learnerList.add(learner));
        double numberOfHoursPerLearner = numberOfHours / learnerList.size();
        for(Learner learner : learners) {
            teach(learner, numberOfHoursPerLearner);
        }
    }
}
