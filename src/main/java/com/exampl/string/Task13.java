package com.exampl.string;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task13 {
    //Удаление заданного символа

    public static void main(String[] args) {
        String str = "abcd";
        char ch = 'c';
        String s = "c";
        System.out.println(removeCharacter(str, ch));
        System.out.println(removeCharacter2(str, ch));
        System.out.println(removeCharacter3(str, ch));
        System.out.println(removeCharacter4(str, s));
    }

    public static String removeCharacter(String str, char ch) {
        return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
    }

    public static String removeCharacter2(String str, char ch) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c != ch) {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }

    public static String removeCharacter3(String str, char ch) {
        return str.chars()
                .filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

    }

    public static String removeCharacter4(String str, String ch) {
        int codePoint = ch.codePointAt(0);

        return str.codePoints()
                .filter(c -> c != codePoint)
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.joining());
    }

}
