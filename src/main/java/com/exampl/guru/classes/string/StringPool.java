package com.exampl.guru.classes.string;

public class StringPool {
    public static void main(String[] args) {
        String s1="Cat";
        String s2="Cat";
        String s3=new String("Cat");
        String s4=new String("Cat").intern();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);

        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s3)==0);

    }
}
