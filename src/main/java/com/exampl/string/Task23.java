package com.exampl.string;

import java.util.Arrays;
import java.util.List;

public class Task23 {
    //Применение отступа

    public static void main(String[] args) {
        String days = "Sunday\n"
                      + "Monday\n"
                      + "Tuesday\n"
                      + "Wednesday\n"
                      + "Thursday\n"
                      + "Friday\n"
                      + "Saturday";
        System.out.println(days.indent(10));

        //Каскадом
        List<String> days2 = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday");
        for (int i = 0; i < days2.size(); i++) {
            System.out.println(days2.get(i).indent(i));
        }

        //Отступы в зависимости от длины значений

        days2.stream()
                .forEachOrdered(d -> System.out.println(d.indent(d.length())));

        //html

        String html = "<html>";
        String body = "<body>";
        String h2 = "<h2>";
        String text = "Hello World!";
        String closeH2 = "</h2>";
        String closeBody = "</body>";
        String closeHtml = "</html>";

        System.out.println(html.indent(0) + body.indent(4) + h2.indent(8)
                           + text.indent(12) + closeH2.indent(8) + closeBody.indent(4)
                           + closeHtml.indent(0));
    }
}
