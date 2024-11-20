package com.exampl.arrayCollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Task100 {
    //Поиск элемента массива
    public static void main(String[] args) {
        int[] numbers = {4, 5, 1, 3, 7, 4, 1};
        System.out.println(containsElement(numbers, 7));
        System.out.println(containsElement2(numbers, 10));
        System.out.println(containsElement3(numbers, 5));

        Melon[] melons = new Melon[]{new Melon("Crenshaw", 2000)
                , new Melon("Gac", 1200), new Melon("Bitter", 2200)};
        boolean found = containsElementObject(melons,new Melon("Gac",1200));
        System.out.println(found);

        Comparator<Melon> byType=Comparator.comparing(Melon::getType);
        boolean found2=containsElementObject2(melons,new Melon("Gac",1200),byType);
        System.out.println(found2);

        Comparator<Melon> byWeight=Comparator.comparing(Melon::getWeight);
        boolean found3=containsElementObject2(melons,new Melon("Gac",1200),byWeight);
        System.out.println(found3);

        System.out.println(findIndexOfElement(numbers,3));
        System.out.println(findIndexOfElement2(numbers,3));
    }

    public static boolean containsElement(int[] arr, int toContain) {
        for (int element : arr) {
            if (element == toContain) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsElement2(int[] arr, int toContain) {
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, toContain);
        return index >= 0;
    }

    public static boolean containsElement3(int[] arr, int toContain) {
        return Arrays.stream(arr)
                .anyMatch(i -> i == toContain);
    }

    public static <T> boolean containsElementObject(T[] arr, T toContain) {
        for (T element : arr) {
            if (element.equals(toContain)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean containsElementObject2(T[] arr, T toContain, Comparator<? super T> comparator) {
        for (T element : arr) {
           if (comparator.compare(element, toContain) == 0) {
               return true;
           }
        }
        return false;
    }
    public static <T> boolean containsElementObject3(
            T[] arr, T toContain, Comparator<? super T> comparator) {
      Arrays.sort(arr, comparator);
      int index = Arrays.binarySearch(arr, toContain, comparator);
        return index >= 0;
    }

    public static int findIndexOfElement(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public static int findIndexOfElement2(int[] arr, int toFind) {
        return IntStream.range(0, arr.length)
                .filter(i->toFind==arr[i])
                .findFirst()
                .orElse(-1);
    }

    public static  <T> int findIndexOfElementObject(T[] arr, T toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(toFind)) {
                return i;
            }
        }
        return -1;
    }

    public static  <T> int findIndexOfElementObject2(
            T[] arr, T toFind,Comparator<? super T> comparator) {
        for (int i = 0; i < arr.length; i++) {
           if (comparator.compare(arr[i], toFind) == 0) {
               return i;
           }
        }
        return -1;
    }

    public static  <T> int findIndexOfElementObject3(T[] arr, T toFind,Comparator<? super T> comparator) {
        return IntStream.range(0, arr.length)
                .filter(i -> comparator.compare(toFind, arr[i]) == 0)
                .findFirst()
                .orElse(-1);
    }

}
