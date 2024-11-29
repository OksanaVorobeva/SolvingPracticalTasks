package com.exampl.taskGuru.prt2.hous;

import com.exampl.taskGuru.logicom.RoadLogistics;
import com.exampl.taskGuru.logicom.SeaLogistics;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HouseManager manager = new HouseManager();
        manager.chooseParameter("Heat");
        manager.changeIndicator(10);
        System.out.println(House.getInstance().getTemperature());
        manager.changeIndicator(10);
        System.out.println(House.getInstance().getTemperature());

    }
}




