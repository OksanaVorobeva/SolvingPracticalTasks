package com.exampl.guru.factoryMetod.hous;

public class HeatFactory implements ServiceOfHouse {
    @Override
    public void changeParam(int value, House house) {
        createExecutor().execute(value,house);
    }

    @Override
    public Executor createExecutor() {
        return new Heater();
    }
}
