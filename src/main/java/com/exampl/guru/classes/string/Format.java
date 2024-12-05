package com.exampl.guru.classes.string;

public class Format {
    public static void main(String[] args) {
        String login="  root  ";
        System.out.println(getFormatLogin(login));
        String str1="CAT DOG";
        String str2="top";
        System.out.println(replaceSecondWord(str1, str2));
    }
    static String getFormatLogin(String str) {
        return str.trim().toLowerCase();
    }

    static String replaceSecondWord(String str1, String str2) {
        int i=str1.indexOf(" ");
        String secondWord=str1.substring(i+1);
        System.out.println(secondWord);
        if (secondWord.equals(str2)) {
            System.out.println("Second word found");
        }else {
            str1=str1.substring(0,i+1)+str2;
        }
        return str1;
    }
}
