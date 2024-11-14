package com.exampl.string;

import java.util.regex.Pattern;

public class Task16 {
    //Проверка наличия подстроки в строке

    public static void main(String[] args) {
        String text = "Hello World!";
        String subtext="orxl";
        boolean result = true;
       // result= text.contains(subtext);
      //  result = text.indexOf(subtext) != -1;
        result=text.matches("(?i).*" + Pattern.quote(subtext)+".*");
        System.out.println(result);
    }
}
