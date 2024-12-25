package com.exampl.guru.multithreading.hwThreader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task2 {
    //Создать класс поток который создает файл и записывает в него произвольно
    //сгенерированный массив из 10 случайных чисел
    //запустить 5 потоков
    public static void main(String[] args) {
        new Thread(new Task2Thread()).start();
        new Thread(new Task2Thread()).start();
        new Thread(new Task2Thread()).start();
        new Thread(new Task2Thread()).start();
        new Thread(new Task2Thread()).start();
    }


}

class Task2Thread extends Thread {
    private int[] array = new int[10];

    public int[] arrayGenerator() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public void recordFile(int[] array) {
        File file = new File("task" + Thread.currentThread().getId() + ".txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            try {
                for (int i = 0; i < array.length; i++) {
                    fileWriter.write(i);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        int [] array = arrayGenerator();
        recordFile(array);
    }
}

