package com.exampl.guru.fiel.hw;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    //Создайте файл с текстом
    //Прочитайте файл
    //Подсчитать в тексте количество знаков препинания и слов

    public static void main(String[] args) throws IOException {
        File f = new File("testTask2.txt");

        try(FileWriter writer=new FileWriter(f)){
            writer.write("nnn ddd ,  . kkkkw  wwww");
        }
         try (FileReader reader = new FileReader(f)){
             Scanner scanner = new Scanner(reader);
             String ellipsis = "[.].{3}";
             String punct = "[-.,:;!?'\"()]";
             String splitByWords = "[^a-aZ-Za-яеА-ЯЕ]+";

             int countPunct=0;
             int countWords=0;

             while(scanner.hasNextLine()){
                 String line = scanner.nextLine();
                 countPunct += line.length()-line.replaceAll(ellipsis," ").replaceAll(punct,"").length();
                 countWords+=line.split(splitByWords).length;
             }

             System.out.println(countWords +" "+countPunct);
         }

    }

}
