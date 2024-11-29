package com.exampl.taskGuru.prt2.hous;

public class Heater implements Executor {

    @Override
    public void execute(int value, House house) {
        house.setTemperature(house.getTemperature() + value);
    }
}
