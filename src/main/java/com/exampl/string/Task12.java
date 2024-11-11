package com.exampl.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Task12 {
    //Удаление повторяющихся символов

    public static void main(String[] args) {
        String string = "andbaasje";
        System.out.println(removeDuplicates(string));
        System.out.println(removeDuplicates2(string));
        System.out.println(removeDuplicates3(string));

    }

    public static String removeDuplicates(String S) {
        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeDuplicates2(String S) {
        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (char c : chars) {
            if (set.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeDuplicates3(String str) {
       return Arrays.asList(str.split(""))
               .stream()
               .distinct()
               .collect(Collectors.joining());
    }

}
