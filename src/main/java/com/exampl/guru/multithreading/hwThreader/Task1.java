package com.exampl.guru.multithreading.hwThreader;


import java.util.Random;

public class Task1 {
    //Создать класс который генерирует мвссив случайных целых чисел из 10 элементов
    //затем находим максимальный элемент в этом массиве и выводин на экран
    //имя потока и элемент

    public static void main(String[] args) {
        new Thread(new Task1Thread()).start();
        new Thread(new Task1Thread()).start();
        new Thread(new Task1Thread()).start();
        new Thread(new Task1Thread()).start();
        new Thread(new Task1Thread()).start();
        new Thread(new Task1Thread()).start();
        new Thread(new Task1Thread()).start();
        new Thread(new Task1Thread()).start();
        new Thread(new Task1Thread()).start();
        new Thread(new Task1Thread()).start();
    }

}
class Task1Thread extends Thread {
    private int[] array  = new int [10];

    public int [] arrayGenerator(){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public int maxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public void run() {
        int[] array = arrayGenerator();
        int max = maxValue(array);
        System.out.println(Thread.currentThread().getName()+ " max: "+max);
    }
}

