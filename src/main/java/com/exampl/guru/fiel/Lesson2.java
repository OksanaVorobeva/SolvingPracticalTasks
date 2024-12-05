package com.exampl.guru.fiel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson2 {
    public static void main(String[] args) {

    }
    //Использование блока finally для закрытия ресурса
    public static String readFirstLineFinallyBlock(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        }finally {
            if(br != null){
                br.close();
            }
        }
    }

    //Использоввние конструкции try-with -resources для закрытия ресурсa

    public static String readFirstLine(String path) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            return bufferedReader.readLine();
        }
    }

    //Использоввние конструкции try-with -resources для закрытия нескольких ресурсов
    public static String readFirstLine2(String path) throws IOException {
        try (FileReader fr = new FileReader(path)){
            BufferedReader br = new BufferedReader(fr);
            return br.readLine();
        }
    }
}
