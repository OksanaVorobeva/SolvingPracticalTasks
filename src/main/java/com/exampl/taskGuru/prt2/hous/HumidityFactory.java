package com.exampl.taskGuru.prt2.hous;

public class HumidityFactory implements ServiceOfHouse{
    @Override
    public void changeParam(int value, House house) {
        createExecutor().execute(value,house);
    }

    @Override
    public Executor createExecutor() {
        return new Humidifier();
    }
}
