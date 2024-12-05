package com.exampl.guru.factoryMetod.hous;

public class Heater implements Executor {

    @Override
    public void execute(int value, House house) {
        house.setTemperature(house.getTemperature() + value);
    }
}
