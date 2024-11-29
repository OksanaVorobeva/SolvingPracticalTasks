package com.exampl.taskGuru.prt2.hous;

public class House {

    private static House instance;
    private int temperature;
    private int humidity;

    private House() {}

    public static House getInstance() {
        if (instance == null) {
            instance = new House();
        }
        return instance;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
