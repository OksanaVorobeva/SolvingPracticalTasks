package com.exampl.arrayCollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 23, 45, 12};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        shuffleInt(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(insertionSort(arr)));
        shuffleInt(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(countingSort(arr)));
        shuffleInt(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(heapSort(arr)));

        Melon[] melons = new Melon[3];
        melons[0] = new Melon("a", 3);
        melons[1] = new Melon("c", 6);
        melons[2] = new Melon("b", 2);
        Comparator<Melon> byType = Comparator.comparing(Melon::getType).reversed();
        Comparator<Melon> byType2 = Comparator.comparing(Melon::getType)
                .thenComparing(Melon::getWeight);
        //bubbleSortWithComparator(melons, byType);
        //insertionSortWithComparator(melons, byType2);
        System.out.println(Arrays.toString(melons));

    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static <T> void bubbleSortWithComparator(T[] arr, Comparator<? super T> comparator) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static <T> void insertionSortWithComparator(T[] arr, Comparator<? super T> comparator) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && comparator.compare(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static int[] countingSort(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] counts = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i] - min]++;
        }
        int sortedIndex = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                arr[sortedIndex++] = i + min;
                counts[i]--;
            }
        }
        return arr;
    }

    public static int[] heapSort(int[] arr) {
        int n = arr.length;
        buildHeap(arr, n);
        while (n > 1) {
            swap(arr, 0, n - 1);
            n--;
            heapify(arr, n, 0);
        }
        return arr;
    }

    private static void buildHeap(int[] arr, int n) {
        for (int i = arr.length / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int greater;
        if (left < n && arr[left] > arr[i]) {
            greater = left;
        } else {
            greater = i;
        }
        if (right < n && arr[right] > arr[greater]) {
            greater = right;
        }
        if (greater != i) {
            swap(arr, i, greater);
            heapify(arr, n, greater);
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void shuffleInt(int[] arr) {
        int index;
        Random random = new Random();
        for (int i = arr.length-1; i > 0; i--) {
            index = random.nextInt(i + 1);
            swap(arr, index, i);
        }
    }
}
