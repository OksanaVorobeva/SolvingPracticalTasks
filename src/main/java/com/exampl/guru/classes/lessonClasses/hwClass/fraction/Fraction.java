package com.exampl.guru.classes.lessonClasses.hwClass.fraction;

public class Fraction {
    public  int numerator;
    public  int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String showFraction(){
        return numerator + "/" + denominator;
    }

    public double multiply(double number) {
        return  number*numerator/denominator;
    }

    public double divide(double number) {
        return (double) numerator/denominator/number;
    }

}
