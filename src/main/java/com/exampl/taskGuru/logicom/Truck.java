package com.exampl.taskGuru.logicom;

public class Truck implements Transport {
    @Override
    public  void  deliver(){
        System.out.println("Truck delivered");
    }
}