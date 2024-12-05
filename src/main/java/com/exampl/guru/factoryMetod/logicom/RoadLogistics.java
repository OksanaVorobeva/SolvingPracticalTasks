package com.exampl.guru.factoryMetod.logicom;

public class RoadLogistics extends Logistics {
    @Override
    public Transport creatTransport() {
        return new Truck();
    }
}
