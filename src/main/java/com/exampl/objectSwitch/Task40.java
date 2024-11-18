package com.exampl.objectSwitch;

import java.util.*;

public class Task40 {
    //Проверка ссылок на null в функциональном и императивном  стилях

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 16, 7, null);
        System.out.println(evenIntegers(numbers));
        System.out.println(evenIntegers2(numbers));
        System.out.println(sumIntegers(numbers));
        System.out.println(sumIntegers2(numbers));
        System.out.println(integersContainsNulls(numbers));
        System.out.println(integersContainsNulls2(numbers));

    }

    public static List<Integer> evenIntegers(List<Integer> integers) {
        if (integers == null) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> evens = new ArrayList<>();
        for (Integer nr : integers) {
            if (nr != null && nr % 2 == 0) {
                evens.add(nr);
            }
        }
        return evens;
    }

    public static List<Integer> evenIntegers2(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> evens = new ArrayList<>();
        for (Integer nr : integers) {
            if (Objects.nonNull(nr) && nr % 2 == 0) {
                evens.add(nr);
            }
        }
        return evens;
    }

    public static int sumIntegers(List<Integer> integers) {
        if (integers == null) {
            throw new IllegalArgumentException("integers can't be null");
        }
        return integers.stream()
                .filter(i -> i != null)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int sumIntegers2(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            throw new IllegalArgumentException("integers can't be null");
        }
        return integers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static  boolean integersContainsNulls(List<Integer> integers) {
        if(integers == null){
            return false;
        }
        return integers.stream()
                .anyMatch(i -> i == null);
    }

    public static  boolean integersContainsNulls2(List<Integer> integers) {
        if(Objects.isNull(integers)){
            return false;
        }
        return integers.stream()
                .anyMatch(Objects::isNull);
    }

}
