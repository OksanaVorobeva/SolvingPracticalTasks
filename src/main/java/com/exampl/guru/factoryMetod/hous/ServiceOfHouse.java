package com.exampl.guru.factoryMetod.hous;

public interface ServiceOfHouse {
    void changeParam(int value, House house);
    Executor createExecutor();
}
