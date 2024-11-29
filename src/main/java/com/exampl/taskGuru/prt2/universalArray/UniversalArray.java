package com.exampl.taskGuru.prt2.universalArray;

public class UniversalArray<T> {
    private T[] array;

    public UniversalArray(T[] array) {
        this.array = array;
    }

   public T search(int index) {
        return index >= 0 && index < array.length ? array[index] : null;
   }
}


class Test5 {
    public static void main(String[] args) {

    }
}
