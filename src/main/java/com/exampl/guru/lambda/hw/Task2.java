package com.exampl.guru.lambda.hw;

import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        int number =0;
        Function<Integer,String> function = (n)-> {
            if (n>0){
                return  "Положительное число";
            } else if (n<0) {
                return  "Отрицательное число";
            }else {
                return  "Ноль";
            }
        };
        System.out.println(function.apply(number));

    }
}
