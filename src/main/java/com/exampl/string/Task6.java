package com.exampl.string;

public class Task6 {
    //Подсчет появлений некоторых символов

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(counterOccurrencesOfACertainCharacter(str, 'c'));
        System.out.println(counterOccurrencesOfACertainCharacter1(str,"c"));
        System.out.println(counterOccurrencesOfACertainCharacter2(str,'c'));
    }

    public static int counterOccurrencesOfACertainCharacter (String str, char ch) {
        return  str.length()-str.replace(String.valueOf(ch),"").length();
    }

    public static int counterOccurrencesOfACertainCharacter1 (String str, String ch) {
        if (ch.codePointCount(0, ch.length())>1) {
            return  -1;
        }

        int result= str.length()-str.replace(String.valueOf(ch),"").length();
        return  ch.length() ==2? result/2:result;
    }

    public static long counterOccurrencesOfACertainCharacter2 (String str, char ch) {
        return  str.chars()
                .filter(c->c==ch)
                .count();

    }

}
