package com.exampl.guru.generics.vehicle;

import java.util.ArrayList;
import java.util.List;

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