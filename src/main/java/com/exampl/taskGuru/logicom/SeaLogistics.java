package com.exampl.taskGuru.logicom;

public class SeaLogistics extends Logistics {
    @Override
    public Transport creatTransport() {
        return new Ship();
    }
}
