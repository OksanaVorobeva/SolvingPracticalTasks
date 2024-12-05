package com.exampl.guru.exeption.hw;

class Division {

public Double divide(String... argument) {
    int result = Integer.parseInt(argument[0]);
    try {
        for (int i = 0; i < argument.length - 1; i++) {
            result /= Integer.parseInt(argument[i]);
        }
    } catch (NumberFormatException e) {
        e.printStackTrace();
    } catch (NullPointerException e) {
        e.printStackTrace();
    } catch (ArithmeticException e) {
        e.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
    }
    return (double) result;
}
}


class DivisionTest {
    public static void main(String[] args) {
        Division d = new Division();
        System.out.println(d.divide(new String[]{"1"}));
    }
}