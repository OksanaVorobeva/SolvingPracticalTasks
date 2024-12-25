package com.exampl.guru.lambda;

public class Task2 {
    public static void main(String[] args) {
        Operation func = action(1);
        int a = func.execute(6, 5);
        int b = action(2).execute(8, 2);
        System.out.println(a);
        System.out.println(b);
    }

    private static Operation action(int number) {
        switch (number) {
            case 1:
                return (a, b) -> a + b;
            case 2:
                return (a, b) -> a - b;
            case 3:
                return (a, b) -> a * b;
            default:
                return (a, b) -> 0;
        }
    }
}





interface Operation{
    int execute(int a, int b);
}