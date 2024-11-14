package com.exampl.string;

public class Task21 {
    //Удаление начальных и замыкающих пробелов

    public static void main(String[] args) {
        String text = "                hello        " ;
        System.out.println(text.trim());
        char space ='\u2002';
        String text2=space+text+space;
        System.out.println(text2.strip());
    }
}
