package com.exampl.string;

public class Task38 {
    //Совмещеннок умножение-сложение
    public static void main(String[] args) {
        double x=49.29d;
        double y=-28.58d;
        double z=33.63d;
        double q =(x*y) +z;
        System.out.println(q);
        double fma = Math.fma(x,y,z);
        System.out.println(fma);
    }
}
