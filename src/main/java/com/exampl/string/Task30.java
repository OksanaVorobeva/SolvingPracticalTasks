package com.exampl.string;

public class Task30 {
    //Вычисление часного и остатка от деления
    //беззнаковых значений

    public static void main(String[] args) {
        int divisionSignedMinMax = Integer.MIN_VALUE / Integer.MAX_VALUE;
        System.out.println(divisionSignedMinMax);

        int divisionSignedMaxMin = Integer.MAX_VALUE / Integer.MIN_VALUE;
        System.out.println(divisionSignedMaxMin);

        int moduloSignedMinMax = Integer.MIN_VALUE % Integer.MAX_VALUE;
        System.out.println(moduloSignedMinMax);

        int moduloSignedMaxMin = Integer.MAX_VALUE % Integer.MIN_VALUE;
        System.out.println(moduloSignedMaxMin);

        //беззнаковый
        int divisionSignedMinMax2 = Integer.divideUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(divisionSignedMinMax2);

        int divisionSignedMaxMin2 = Integer.divideUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.println(divisionSignedMaxMin2);

        int moduloSignedMinMax2 = Integer.remainderUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(moduloSignedMinMax2);

        int moduloSignedMaxMin2 = Integer.remainderUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.println(moduloSignedMaxMin2);
    }
}
