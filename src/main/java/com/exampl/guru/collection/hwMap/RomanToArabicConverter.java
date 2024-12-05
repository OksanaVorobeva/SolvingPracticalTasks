package com.exampl.guru.collection.hwMap;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabicConverter {
    public static void main(String[] args) {
        System.out.println(romanToArabic("XII"));
        System.out.println(romanToArabic("CM"));
    }

    public static  int romanToArabic(String roman){
        Map<Character,Integer> romanToArabic = new HashMap<>();
        romanToArabic.put('I',1);
        romanToArabic.put('V',5);
        romanToArabic.put('X',10);
        romanToArabic.put('L',50);
        romanToArabic.put('C',100);
        romanToArabic.put('D',500);
        romanToArabic.put('M',1000);
        int result =0;
        int prevValue = 0;

        for (int i = roman.length()-1; i >=0; i--) {
            int value = romanToArabic.get(roman.charAt(i));
            if(value < prevValue){
                result -= value;
            }else {
                result += value;
            }
            prevValue = value;
        }
        return result;
    }
}



