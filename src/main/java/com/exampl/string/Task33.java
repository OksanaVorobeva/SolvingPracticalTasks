package com.exampl.string;

import java.math.BigInteger;

public class Task33 {
    //Конвертирование значения типа BigInteger в примитивный тип

    public static void main(String[] args) {

        BigInteger nr =BigInteger.valueOf(Long.MAX_VALUE);
        long nrExactLong =nr.longValueExact();
        int nrExactInt =nr.intValueExact();
    }
}
