package com.exampl.guru.factoryMetod.logicom;

public class SeaLogistics extends Logistics {
    @Override
    public Transport creatTransport() {
        return new Ship();
    }
}
