package com.exampl.guru.fiel.hw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

public class Person implements Serializable {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", age=" + age +
               '}';
    }

    public static Person createRandomPerson() {
        String[] names = {"John", "Jane", "Bob"};
        String[] surnames = {"Doe", "Smith"};
        Random random = new Random();
        String randomName = names[random.nextInt(names.length)];
        String randomSurname = surnames[random.nextInt(surnames.length)];
        int randomAge = random.nextInt(50);

        return new Person(randomName, randomSurname, randomAge);
    }
}

class PersonTest {
    public static void main(String[] args) {
        String fileName = "testPerson.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                Person person = Person.createRandomPerson();
                writer.write(person.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}