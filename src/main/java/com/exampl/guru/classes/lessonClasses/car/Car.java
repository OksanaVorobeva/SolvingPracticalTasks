package com.exampl.guru.classes.lessonClasses.car;

public class Car {
    final String model;
    String color;
    double engine;
    int fuelVolume;
    double fuelConsumption;
    double fueLevel;

    public Car(String model) {
        this.model = model;
    }

    void move(int x1,int y1,int x2,int y2) {
        double d =Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        double fuelUsed =d/100*fuelConsumption;
        fueLevel=fueLevel-fuelUsed;
        if (fueLevel<=0) {
            System.out.println("fuel level is lower than 0");
            fueLevel=0;
        }else {
            System.out.println(x2+y2);
        }
    }

    void refuel(int liters){
        fueLevel =fueLevel+liters;
        if (fueLevel>fuelVolume) {
            System.out.println("fuel level is higher than "+fueLevel);
            fueLevel=fuelVolume;
        }else {
            System.out.println("fuel level is lower than "+fueLevel);
        }
    }

    String getFullInfo(){
        return model+" "+color+" "+engine+" "+fuelVolume+" "+fuelConsumption+" "+fueLevel;
    }
}
