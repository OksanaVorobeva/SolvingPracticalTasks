package com.exampl.string;

public class Task35 {
    //Вычисление целой части деления и целой части остатка от деления

    public static void main(String[] args) {
        int x=-222;
        int y=14;
        System.out.println(Math.floorDiv(x,y));
        System.out.println(Math.floorMod(x,y));
        System.out.println(Math.ceilDiv(x,y));

    }
}
