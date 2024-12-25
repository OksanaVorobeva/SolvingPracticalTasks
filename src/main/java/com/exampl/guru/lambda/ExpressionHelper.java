package com.exampl.guru.lambda;

public class ExpressionHelper {
    static boolean isEven(int n){
        return n % 2 == 0;
    }

    static boolean isPositive(int n){
        return n > 0;
    }

    public static  int sum(int[] numbers, Expression e){
        int sum = 0;
        for(int i:numbers){
            if(e.isEqual(i)){
                sum += i;
            }
        }
        return sum;
    }
}

interface Expression {
    boolean isEqual(int n);
}

class  TestExpression {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println(ExpressionHelper.sum(numbers,ExpressionHelper::isEven));
        Expression e = ExpressionHelper::isPositive;
        System.out.println(ExpressionHelper.sum(numbers,e));
    }
}