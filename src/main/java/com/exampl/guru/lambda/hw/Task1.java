package com.exampl.guru.lambda.hw;

import java.util.Locale;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        String s = null;
        Predicate<String> predicate1 = (s1 -> {
            if (s1==null) {
                return false;
            }
            return true;
        });
        System.out.println(predicate1.test(s));


        String s2 = "";

        Predicate<String> predicate2 = s1 -> s1.length()>0;
        System.out.println(predicate2.test(s2));

        String s3 = "JnA";

        Predicate<String> predicate3 = s1-> s1.matches("^([JN].A)$");

        System.out.println(predicate3.test(s3));

    }
}
