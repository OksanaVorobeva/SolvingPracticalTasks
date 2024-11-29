package com.exampl.taskGuru.prt2.vehicle;

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

class Car extends Vehicle {
    public Car(int id, String name) {
        super(id, name);
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle(int id, String name) {
        super(id, name);
    }
}

class Garage<T extends Vehicle> {
    private List<T> vehicles;

    public void addVehicle(T vehicle) {
        vehicles=new ArrayList<>();
        vehicles.add(vehicle);
    }

    public List<T> getVehicles() {
        return vehicles;
    }

    @Override
    public String toString() {
        return "Garage{" +
               "vehicles=" + vehicles +
               '}';
    }
}

class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        String name = scanner.next();
        Vehicle vehicle = new Vehicle(id, name);

       Garage garages = new Garage();
       garages.addVehicle(vehicle);
        scanner.close();
        System.out.println(garages.getVehicles());
    }
}
