package com.exampl.string;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task20 {
    //Конкатенирование одной и той же строки н раз

    public static void main(String[] args) {
        String s="abc";
        int n =5;
        StringBuilder sb=new StringBuilder(s.length()*n);
        for(int i=1;i<=n;i++){
            sb.append(s);
        }
        System.out.println(sb.toString());
        String result= "hello".repeat(n);
        System.out.println(result);
        String result2= String.join("", Collections.nCopies(n, s));
        System.out.println(result2);
        String result3= Stream.generate(()->s)
                .limit(n)
                .collect(Collectors.joining());
        System.out.println(result3);
        String result4= String.format("%0"+n+"d",0)
                .replace("0",s);
        System.out.println(result4);
        String result5=new String(new char[n]).replace("\0",s);
        System.out.println(result5);
        System.out.println(hasOnlySubstrings(result));
    }

    //является ли строка последовательностью одной и той же подстроки

    public static boolean hasOnlySubstrings(String str){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length()/2;i++){
            sb.append(str.charAt(i));
            String result=str.replaceAll(sb.toString(),"");
            if (result.length()==0){
                return true;
            }
        }
        return false;
    }


}
