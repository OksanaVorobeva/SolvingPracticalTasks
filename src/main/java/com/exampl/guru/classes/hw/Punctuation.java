package com.exampl.guru.classes.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Punctuation {
    //Кол-во знаков припенания
    public static void main(String[] args) {
        findPunctuation();
    }

    public static void findPunctuation() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
