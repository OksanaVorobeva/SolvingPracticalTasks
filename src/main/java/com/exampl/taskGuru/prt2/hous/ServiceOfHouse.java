package com.exampl.taskGuru.prt2.hous;

public interface ServiceOfHouse {
    void changeParam(int value, House house);
    Executor createExecutor();
}
