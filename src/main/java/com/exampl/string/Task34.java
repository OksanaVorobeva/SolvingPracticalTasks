package com.exampl.string;

public class Task34 {
    //Конвертирование значения типа long в значение типа int

    public static void main(String[] args) {
        long nr = Integer.MAX_VALUE;
        int intNrCast = (int) nr;
        long nrMaxLong = Long.MAX_VALUE;

        //выбрасывает исключения

        int intNrMaxExact = Math.toIntExact(nrMaxLong);

    }
}
