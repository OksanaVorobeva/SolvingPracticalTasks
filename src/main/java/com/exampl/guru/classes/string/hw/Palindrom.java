package com.exampl.guru.classes.string.hw;

public class Palindrom {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome2(s));
        System.out.println(isPalindrome3(s));
        System.out.println(isPalindrome4(s));
        System.out.println(isPalindrome5(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll(" +", "")
                .replaceAll("\\p{Punct}", "")
                .toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        s = s.replaceAll(" +", "")
                .replaceAll("\\p{Punct}", "")
                .toLowerCase();
        return new StringBuffer(s).reverse().toString().equals(s);
    }

    public static boolean isPalindrome3(String s) {
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return new StringBuffer(s).reverse().toString().equals(s);
    }

    public static boolean isPalindrome4(String s) {
        String string = s.replaceAll("\\p{Punct}", "")
                .replaceAll(" +", "")
                .toLowerCase();
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString().equals(string);
    }

    public static boolean isPalindrome5(String s) {
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char c = s.charAt(start);
            char c2 = s.charAt(last);
            if (!Character.isLetterOrDigit(c)) {
                start++;
            } else if (!Character.isLetterOrDigit(c2)) {
                last--;
            } else {
                if (Character.toLowerCase(c) != Character.toLowerCase(c2)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
