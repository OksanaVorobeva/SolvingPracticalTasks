package com.exampl.taskGuru.prt2;

import java.util.ArrayList;

public class MemoryTest {
    public static void main(String[] args) {
        printMemory();
        ArrayList list = new ArrayList();
        for (int i = 0; i < 15000000; i++) {
            list.add(i);
        }
        printMemory();

    }

    public static void printMemory() {
        System.out.println("Max memory: " + Runtime.getRuntime().maxMemory()/1000000);
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory()/1000000);
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory()/1000000);
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Used memory: " + usedMemory/1000000);
        long freeMemory = Runtime.getRuntime().maxMemory()-usedMemory;
        System.out.println("Free memory: " + freeMemory/1000000);
        System.out.println("-------------------------");
    }
}
