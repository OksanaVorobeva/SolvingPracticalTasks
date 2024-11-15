package com.exampl.string;

public class Task28 {
    //Конвертирование в число посредством беззнаковой конверссии

    public static void main(String[] args) {
        long result1 =Integer.toUnsignedLong(Integer.MAX_VALUE);
        System.out.println(result1);

        int result2=Short.toUnsignedInt(Short.MAX_VALUE);
        System.out.println(result2);
        long result3=Short.toUnsignedInt(Short.MIN_VALUE);
        System.out.println(result3);
    }
}
