package com.exampl.guru.factoryMetod.hous;

public class Test {
    public static void main(String[] args) {
        HouseManager manager = new HouseManager();
        manager.chooseParameter("Heat");
        manager.changeIndicator(10);
        System.out.println(House.getInstance().getTemperature());
        manager.changeIndicator(10);
        System.out.println(House.getInstance().getTemperature());

    }
}




