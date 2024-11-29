package com.exampl.taskGuru.pr3;

import java.util.*;

public class HWMap {
}

class HWMap4{
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




class HWMap1 {

    public static void main(String[] args) {
        Map<String, Toy> toyMap = new HashMap<>();
        Toy car= new Toy("Car", 3, 100);
        Toy doll = new Toy("Doll", 3, 200);
        toyMap.put(car.name, car);
        toyMap.put(doll.name, doll);

        for (Map.Entry<String, Toy> item : toyMap.entrySet()) {
            System.out.println(item);
        }

        Set<String> entrySet = toyMap.keySet();
        System.out.println(entrySet);
        Collection<Toy> toys = toyMap.values();
        System.out.println(toys);
    }

}

class Toy {
    String name;
    int age;
    int price;

    Toy(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", price=" + price +
               '}';
    }
}

class HWMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = sc.nextLine();
        List<String> words = Arrays.asList(text.split(" "));
        System.out.println(words);

        Map<String, Integer> duplicationMap = new HashMap<>();

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!cleanWord.isEmpty()) {
                duplicationMap.put(cleanWord, duplicationMap.getOrDefault(cleanWord, 0) + 1);
            }
        }
        System.out.println(duplicationMap);

    }
}

class HWMap3 {
    public static void main(String[] args) {
        System.out.println(getCharsCount("baaccc"));
    }

    public static Map<Character, Integer> getCharsCount(String s) {

        Map<Character, Integer> duplicationMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            duplicationMap.put(c, duplicationMap.getOrDefault(c, 0) + 1);
        }
        return duplicationMap;
    }
}
class Converter{
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



