package com.exampl.string;

public class Task36 {
    //следующее значение с плавающей точкой

    public static void main(String[] args) {
        float f =0.1f;
        System.out.println(Math.nextAfter(f,Float.NEGATIVE_INFINITY));
        System.out.println(Math.nextDown(f));
        System.out.println(Math.nextUp(f));
    }
}
