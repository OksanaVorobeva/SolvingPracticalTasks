package com.exampl.guru.generics.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle {
    private int id;
    private String name;

    public Vehicle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
               "id=" + id +
               ", name='" + name + '\'' +
               '}';
    }
}

