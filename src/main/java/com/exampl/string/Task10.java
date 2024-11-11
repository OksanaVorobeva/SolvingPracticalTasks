package com.exampl.string;

import java.util.HashSet;
import java.util.Set;

public class Task10 {
    //Генерирование всех перестановок
    public static void main(String[] args) {
        permuteAndPrint("abc");
        Set set = new HashSet();
        set = permuteAndPrint2("abc");
        System.out.println(set);
    }

    public static void permuteAndPrint(String str) {
        permuteAndPrint("", str);
    }

    private static void permuteAndPrint(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }

    public static Set<String> permuteAndPrint2(String str) {
        return permuteAndPrint2("", str);
    }

    public static Set<String> permuteAndPrint2(String prefix, String str) {
        Set<String> set = new HashSet<>();
        int n = str.length();
        if (n == 0) {
            set.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                set.addAll(permuteAndPrint2(prefix + str.charAt(i)
                        , str.substring(i + 1, n) + str.substring(0, i)));
            }
        }
        return set;
    }
}
