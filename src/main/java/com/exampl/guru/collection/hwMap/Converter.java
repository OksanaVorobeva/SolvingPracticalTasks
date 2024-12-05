package com.exampl.guru.collection.hwMap;


import java.util.NavigableMap;
import java.util.TreeMap;

public class Converter {
    private final static NavigableMap<Integer,String> symbols=new TreeMap<>();
    static {
        symbols.put(1000, "M");
        symbols.put(900, "CM");
        symbols.put(500, "D");
        symbols.put(400, "CD");
        symbols.put(100, "C");
        symbols.put(90, "XC");
        symbols.put(50, "L");
        symbols.put(40, "XL");
        symbols.put(10, "X");
        symbols.put(9, "IX");
        symbols.put(5, "V");
        symbols.put(4, "IV");
        symbols.put(1, "I");
    }

    public static String convertArabicToRoman(int number) {
        if (number > 3900| number<0) {
            System.out.println("Invalid number");
        }
        StringBuilder result = new StringBuilder();
        for (Integer elem :symbols.descendingKeySet()){
            while (number>=0&&number>=elem){
                result.append(symbols.get(elem));
                number-=elem;
            }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println(converter.convertArabicToRoman(29));
    }
}

