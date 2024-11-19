package com.exampl.taskGuru.logicom;

public class RoadLogistics extends Logistics {
    @Override
    public Transport creatTransport() {
        return new Truck();
    }
}
