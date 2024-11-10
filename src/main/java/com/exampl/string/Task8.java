package com.exampl.string;

public class Task8 {
    //Удаление пробелов из строки

    public static void main(String[] args) {
        String str = "ab    cdefg";
        System.out.println(removeWhitespace(str));
    }

    public static  String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }
}
