package com.exampl.string;

public class Task32 {
    //Применение логического и или исключающего или к двум булевым выражения

    public static void main(String[] args) {

        int s=10;
        int m=21;
        System.out.println(Boolean.logicalAnd(s>m,m<50));
        System.out.println(Boolean.logicalOr(s>m,m<50));
        System.out.println(Boolean.logicalXor(s>m,m<50));
    }
}
