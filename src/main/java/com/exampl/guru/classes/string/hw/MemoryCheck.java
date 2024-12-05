package com.exampl.guru.classes.string.hw;

public class MemoryCheck {
    public static void main(String[] args) {
        String strResult="";

        long startString =System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            strResult +="aaabbbccc";
        }
        long endString =System.currentTimeMillis();
        System.out.println(endString - startString);

        StringBuilder stringBuilder=new StringBuilder();

        long startStringBuilder=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            stringBuilder.append("aaabbbccc");
        }

        long endStringBuilder=System.currentTimeMillis();

        System.out.println(endStringBuilder - startStringBuilder);
    }
}
