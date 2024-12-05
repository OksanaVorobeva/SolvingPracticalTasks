package com.exampl.guru.classes.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    //Количесиво слов

    public static void main(String[] args) {
        System.out.println(countWords());
    }

    public static int countWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words : ");
        String words = scanner.nextLine();
        String cleaWords = words.trim().replaceAll(" +", " ");
        Pattern pattern = Pattern.compile("\\b");
        Matcher matcher = pattern.matcher(cleaWords);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count/2;
    }
}
