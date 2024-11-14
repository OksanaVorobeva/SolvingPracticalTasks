package com.exampl.string;

import java.util.function.BinaryOperator;

public class Task26 {
    //Сложение двух крупных чисел типа int Long
    //и переполнение операции

    public static void main(String[] args) {
        int x1=2;
        int y1=7;
        int z1 =x1+y1;

        int x2=Integer.MAX_VALUE;
        int y2=Integer.MAX_VALUE;
        int z2 =Math.addExact(x2,y2);
        BinaryOperator<Integer> operator=Math::addExact;
        int z22=operator.apply(x2,y2);

        long x3=Integer.MAX_VALUE;
        long y3=Integer.MAX_VALUE;
        long z3 =x3+y3;

        long x4=Long.MAX_VALUE;
        long y4=Long.MAX_VALUE;
        long z4 =x4+y4;

    }
}
