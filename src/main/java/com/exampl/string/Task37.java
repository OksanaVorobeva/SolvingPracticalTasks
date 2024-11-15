package com.exampl.string;

import java.util.function.BinaryOperator;

public class Task37 {
    //Умножение двух крупных значений типа int long и переполнение операции

    public static void main(String[] args) {
        int x=Integer.MAX_VALUE;
        int y=Integer.MAX_VALUE;
       // System.out.println(Math.multiplyExact(x,y));
      //  System.out.println(Math.multiplyFull(x,y));
        long x1=Long.MAX_VALUE;
        long y1=Long.MAX_VALUE;
       // System.out.println(Math.multiplyHigh(x1,y1));
        BinaryOperator<Integer> binaryOperator =  Math::multiplyExact;
        System.out.println(binaryOperator.apply(x, y));
    }
}
