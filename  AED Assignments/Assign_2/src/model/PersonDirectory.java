/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author misra
 */
public class PersonDirectory {

    private ArrayList<Person> people;

    public PersonDirectory() {
        this.people = new ArrayList<Person>();
    }

    public ArrayList<Person> getPerson() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public Person addPerson() {
        Person p = new Person();

        people.add(p);
        return p;
    }

    public void deletePerson(Person person) {
        people.remove(person);
    }

    public Person searchPerson(String str) {

        str = str.toLowerCase();
        for (Person p : people) {
            if (p.getFirstName().toLowerCase().contains(str) || p.getLastName().toLowerCase().contains(str)) {
                return p;
            } else if (p.personAddress.getHomeAddress().toLowerCase().contains(str) || p.personAddress.getWorkAdd().toLowerCase().contains(str)) {
                return p;
            }
        }
        return null;
    }
}
