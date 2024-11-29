package com.exampl.taskGuru.prt2.hous;


public class HouseManager {
    private ServiceOfHouse service;

    void chooseParameter(String  parametr) {
        switch (parametr) {
            case "Humid":
                service = new HumidityFactory();
                break;
            case "Heat":
                service = new HeatFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown service");
        }
    }

    void  changeIndicator(int parameter){
        if (service != null) {
            service.changeParam(parameter,House.getInstance());
        }else {
            System.out.println("Service is null");
        }
    }

}
