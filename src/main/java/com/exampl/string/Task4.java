package com.exampl.string;

public class Task4 {
    //Проверка, содержит ли строковые значения только цифры

    public static void main(String[] args) {
        String str = "123";
        System.out.println(containOnlyDigits(str));
        System.out.println(containOnlyDigits2(str));
        System.out.println(containOnlyDigits3(str));
    }

    public static boolean containOnlyDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean containOnlyDigits2(String s) {
        return !s.chars().anyMatch(n -> !Character.isDigit(n));
    }

    public static boolean containOnlyDigits3(String s) {
        return s.matches("[0-9]+");
    }
}
