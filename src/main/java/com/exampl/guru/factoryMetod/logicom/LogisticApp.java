package com.exampl.guru.factoryMetod.logicom;

import java.util.Scanner;

public class LogisticApp {
    public static Logistics logistics;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type= scanner.nextLine();
        configureLogisticsType(type);
        doLogistics();
    }

    private static void configureLogisticsType(String type) {
        switch (type) {
            case "truck":
                logistics = new RoadLogistics();
                break;
            case "ship":
                logistics = new SeaLogistics();
                break;
            default:
                logistics = new RoadLogistics();
        }
    }

    public static void doLogistics() {
        logistics.doLogistics();
    }
}
