package com.exampl.guru.classes.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    // текс из последних букы всех слов из исходного текса

    public static void main(String[] args) {
        String s = "Hello World top";
        System.out.println(getLastCharWorld(s));
    }

    public static String getLastCharWorld(String input) {
        Pattern p = Pattern.compile("[\\w](?=\\W)");
        Matcher m = p.matcher(input);
        StringBuilder stringBuilder = new StringBuilder();
        while (m.find()) {
            stringBuilder.append(m.group());
        }
        return stringBuilder.toString();
    }
}

