package com.exampl.string;

public class Task29 {
    //Сравление двух беззнаковых чисел

    public static void main(String[] args) {
        int result1= Integer.compare(Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.println(result1);

        int result2= Integer.compareUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(result2);
    }
}
