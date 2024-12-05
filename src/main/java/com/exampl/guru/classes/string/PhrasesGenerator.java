package com.exampl.guru.classes.string;

import java.util.Random;

public class PhrasesGenerator {
    public static void main(String[] args) {
        String[] str1={"красивый","угрюмый","успешный"};
        String[] str2={"я","мальчик","человек"};
        String[] str3={"бежит","растет","танцует"};

        Random rand = new Random();

        StringBuilder stringBuilder = new StringBuilder("Как здорово увидеть как ");
        stringBuilder.append(str1[rand.nextInt(str1.length)]);
        stringBuilder.append(" ");
        stringBuilder.append(str2[rand.nextInt(str2.length)]);
        stringBuilder.append(" ");
        stringBuilder.append(str3[rand.nextInt(str3.length)]);

        System.out.println(stringBuilder.toString());
    }
}
