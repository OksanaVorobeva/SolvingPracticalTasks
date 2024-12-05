package com.exampl.guru.classes.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        Pattern p =Pattern.compile(" +- +");
        Matcher m = p.matcher("Test    -   string - test");
        while (m.find()) {
            System.out.println(m.start() + " " + m.end());
            System.out.println(m.group());
        }
    }
}
