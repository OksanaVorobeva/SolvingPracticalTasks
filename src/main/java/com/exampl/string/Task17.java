package com.exampl.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task17 {
    //Подсчет числа появлений подстроки в строке

    public static void main(String[] args) {
        String string = "111";
        String toFind = "11";
        System.out.println(countSubstrings(string, toFind));
        System.out.println(countSubstrings2(string, toFind));
        System.out.println(countSubstrings3(string, toFind));
    }

    public static int countSubstrings(String string, String toFind) {
        int position = 0;
        int count = 0;
        int n = toFind.length();

        while ((position = string.indexOf(toFind, position)) != -1) {
            position = position + n;
            count++;
        }
        return count;
    }

    public static int countSubstrings2(String string, String toFind) {
        int result = string.split(Pattern.quote(toFind), -1).length - 1;

        return result;
    }

    public static int countSubstrings3(String string, String toFind) {

        Pattern pattern = Pattern.compile(Pattern.quote(toFind));
        Matcher matcher = pattern.matcher(string);

        int position = 0;
        int count = 0;

        while (matcher.find(position)) {
            position = matcher.start() + 1;
            count++;
        }
        return count;
    }


}
