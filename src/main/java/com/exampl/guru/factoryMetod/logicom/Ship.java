package com.exampl.guru.factoryMetod.logicom;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship delivered");
    }
}
