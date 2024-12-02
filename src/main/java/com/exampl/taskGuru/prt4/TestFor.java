package com.exampl.taskGuru.prt4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFor {
    public static void main(String[] args) throws MyException {

        readFile();

    }

    public static void readFile() throws MyException {

        BufferedReader fin = null;
        try {
            fin = new BufferedReader(new FileReader("test1.txt"));
            String line;
            while ((line = fin.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new MyException("Путь указан не верно", "test1.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

class MyException extends Exception {
    String msg;
    String fileName;

    public MyException(String msg, String fileName) {
        super(msg);
        this.msg = msg;
        this.fileName = fileName;
    }
}
