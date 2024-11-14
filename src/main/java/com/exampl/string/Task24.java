package com.exampl.string;

import java.util.stream.Stream;

public class Task24 {
    //Трансформация строк

    public static void main(String[] args) {
        String resultMap = Stream.of("hello")
                .map(s->s+" world")
                .findFirst()
                .get();
        System.out.println(resultMap);

        String result2=Stream.of("gooool! ")
                .map(String::toUpperCase)
                .map(s->s.repeat(2))
                .map(s->s.replace("O","OOOO"))
                .findFirst()
                .get();
        System.out.println(result2);

        String result3 ="hello".transform(s->s + " world");
        System.out.println(result3);

        String result4 ="goool!".transform(String::toUpperCase)
                .transform(s->s.repeat(2))
                .transform(s->s.replace("O","OOOO"));
        System.out.println(result4);
    }
}
