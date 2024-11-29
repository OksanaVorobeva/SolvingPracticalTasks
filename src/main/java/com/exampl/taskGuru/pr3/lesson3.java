package com.exampl.taskGuru.pr3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class lesson3 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person("Tom"));
        persons.add(new Person("Jack"));
        persons.add(new Person("Andrei"));
        System.out.println(persons);

        PersonComparator personComparator = new PersonComparator();
        TreeSet<Person> sortedPersons = new TreeSet<>(personComparator);
        sortedPersons.add(new Person("Alisa"));
        sortedPersons.add(new Person("Bob"));
        sortedPersons.add(new Person("Jack"));
        System.out.println(sortedPersons);

        Comparator<Person> pcomp = new PersonComparator().thenComparing(new PersonAgeComporator());
        TreeSet<Person> sortedPersons2 = new TreeSet<>(pcomp);
        sortedPersons2.add(new Person("Alisa", 23));
        sortedPersons2.add(new Person("Bob", 34));
        sortedPersons2.add(new Person("Jack", 28));
        sortedPersons2.add(new Person("Jack", 25));
        System.out.println(sortedPersons2);

        PersonComparator personComparator2 = new PersonComparator();
        ArrayList<Person> sortedPersons3 = new ArrayList<Person>();
        sortedPersons3.add(new Person("Alisa", 23));
        sortedPersons3.add(new Person("Jack", 25));
        sortedPersons3.add(new Person("Bob", 34));
        sortedPersons3.add(new Person("Jack", 28));
        System.out.println(sortedPersons3);
        sortedPersons3.sort(personComparator2);
        System.out.println(sortedPersons3);
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class PersonAgeComporator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}

