package com.exampl.guru.classes.string.hw;

public class Palindrom2 {
    public static void main(String[] args) {
        String s = "aba";
        String s1 = "abca";
        String s2 = "abc";
        System.out.println(validPalindrome(s));
        System.out.println(validPalindrome(s1));
        System.out.println(validPalindrome(s2));
    }

    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
            return false;
        }
        return true;
    }
}
