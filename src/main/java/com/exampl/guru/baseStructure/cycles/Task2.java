package com.exampl.guru.baseStructure.cycles;

public class Task2 {
    //Посчитать сумму цифр числа 7893823445 с помощью цикла while
    public static void main(String[] args) {
        long num =7_893_823_445L;
        System.out.println(getDigitsSum(num));
    }
    public static long getDigitsSum(long n) {
        long result =0;
        do {
            long lastDigit = n % 10;
            result =+lastDigit;
            n/=10;
        }while (n>0);
        return result;
    }
}
