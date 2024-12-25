package com.exampl.guru.lambda;

public class MathTest {
    @FunctionalInterface
    interface MathInterface<T>{
        T getMax(T first, T next);
    }

    static void print(MathInterface m){
        System.out.println(m.getMax(324,35));
    }

    public static void main(String[] args) {
        MathInterface <Integer>m= (x,y) -> x>y ? x:y;

        print(m);
    }
}
