package com.exampl.guru.generics.vehicle;

import java.util.Scanner;

public class Test {
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
