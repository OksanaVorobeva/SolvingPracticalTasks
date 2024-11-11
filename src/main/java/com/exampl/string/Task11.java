package com.exampl.string;

import java.util.stream.IntStream;

public class Task11 {
    //Проверка что строка является палиндромом

    public static void main(String[] args) {
        String str = "шалаш";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome2(str));
        System.out.println(isPalindrome3(str));
        System.out.println(isPalindrome4(str));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome3(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static boolean isPalindrome4(String s) {
        return IntStream.range(0, s.length() / 2)
                .noneMatch(p -> s.charAt(p) !=
                                s.charAt(s.length() - p - 1));
    }

}
