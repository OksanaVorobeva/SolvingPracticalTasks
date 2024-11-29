package com.exampl.taskGuru.prt2.hous;

public class Humidifier implements Executor {

    @Override
    public void execute(int value, House house) {
        house.setHumidity(house.getHumidity() + value);
    }
}
