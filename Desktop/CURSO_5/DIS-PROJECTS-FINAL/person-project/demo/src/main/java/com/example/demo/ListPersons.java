package com.example.demo;

import java.util.ArrayList;

public class ListPersons {
    private ArrayList<Person> person;


    public ListPersons(ArrayList<Person> person) {
        this.person = person;
    }

    public ArrayList<Person> getpersons() {
        return person;
    }

    public Person getPersonbyID(String targetId) {

        for (Person person : this.person) {
            if (person.getId().equals(targetId)) {
                return person;
            }
        }

        throw new IllegalArgumentException("person with ID " + targetId + " not found.");
    }

    public void setperson(ArrayList<Person> person) {
        this.person = person;
    }

    // Método para añadir un nuevo objeto person a la lista
    public void addperson(Person person) {
        this.person.add(person);
    }
   
}
