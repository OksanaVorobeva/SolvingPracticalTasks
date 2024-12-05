package com.exampl.guru.exeption.hw;

public class Task1 {
    public static void main(String[] args) {
        String s= null;
        try {
            System.out.println(s.toString());
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
