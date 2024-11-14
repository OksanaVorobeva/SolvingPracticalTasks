package com.exampl.string;

import java.util.function.BinaryOperator;

public class Task25 {
    //Вычисление минимума и максимума двух чисел

    public static void main(String[] args) {
        int i1=-45;
        int i2=-15;
        int min=Math.min(i1,i2);
        int max=Math.max(i1,i2);
        System.out.println(min + " " +max);

        double d1=0.023844D;
        double d2=0.35468856D;
        double min1=Double.min(d1,d2);
        double max1=Double.max(d1,d2);

        float f1=33.34F;
        final float f2=33.213F;
        float min3 = BinaryOperator.minBy(Float::compare).apply(f1,f2);
        float max3 = BinaryOperator.maxBy(Float::compare).apply(f1,f2);

    }
}
