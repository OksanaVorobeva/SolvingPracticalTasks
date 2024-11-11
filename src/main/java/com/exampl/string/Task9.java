package com.exampl.string;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Task9 {
    //Соединение нескольких строк с помощью разделителя
    public static void main(String[] args) {
        String str = "abc";
        String s="jjj";
        char d='/';
        System.out.println(joinByDelimiter(d, str,s));
        System.out.println(joinByDelimiter2(d, str,s));
        String result = String.join(" ","nnn","mmm");
        System.out.println(result );
        System.out.println(joinByDelimiter3(d, str,s));
    }

    public static String joinByDelimiter(char delimiter, String... strings) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (i = 0; i < strings.length - 1; i++) {
            sb.append(strings[i]).append(delimiter);
        }
        sb.append(strings[i]);
        return sb.toString();
    }

    public static String joinByDelimiter2(char delimiter, String... strings) {
        StringJoiner joiner= new StringJoiner(String.valueOf(delimiter));
        for (String string : strings) {
            joiner.add(string);
        }
        return joiner.toString();
    }

    public static String joinByDelimiter3(char delimiter, String... strings) {
        return Arrays.stream(strings,0,strings.length)
                .collect(Collectors.joining(String.valueOf(delimiter)));
    }

}
