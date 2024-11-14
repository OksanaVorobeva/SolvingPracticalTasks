package com.exampl.string;

public class Task27 {
    //Строка как беззнаковое число
    //с основанием системы счистления

    public static void main(String[] args) {
        String nri="255500";
        int result =Integer.parseUnsignedInt(nri,Character.MAX_RADIX);
        int result2 =Integer.parseUnsignedInt(nri);
        int result3 =Integer.parseUnsignedInt(nri,1,4,Character.MAX_RADIX);
        System.out.println(result3);
    }
}
