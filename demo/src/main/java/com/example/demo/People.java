package com.example.demo;

import com.example.demo.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person>implements Iterable <PersonType> {

    private List<PersonType> peopleList=new ArrayList<>();

    @Override
    public String toString() {
        return "com.example.demo.People{" +
                "peopleList=" + peopleList +
                '}';
    }

    public People(PersonType...persons){
        if(peopleList!=null) {
            peopleList.addAll(Arrays.asList(persons));

        }
    }

    public People(List<PersonType> peopleList) {
        this.peopleList = peopleList;

    }

    public void addPerson(PersonType person)
    {
        if (person != null) {
            peopleList.add(person);
        }
    }

    public void removePerson(PersonType person) {
        if (person != null) {
            peopleList.remove(person);
        }
    }

    public Integer size()
    {
       return peopleList.size();
    }

    public void clear(){
        peopleList.clear();
    }

    public void addAll(List<PersonType> personTypeList){

        peopleList.addAll(personTypeList);
    }

    public PersonType findById(long id)
    {
        for(PersonType p : peopleList) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    public List<PersonType> findAll()
    {
        return peopleList;
    }

    @Override
    public Iterator<PersonType> iterator(){
        return peopleList.iterator();
    }
}
