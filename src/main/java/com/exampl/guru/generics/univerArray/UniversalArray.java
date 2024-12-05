package com.exampl.guru.generics.univerArray;

public class UniversalArray<T> {
    private T[] array;

    public UniversalArray(T[] array) {
        this.array = array;
    }

   public T search(int index) {
        return index >= 0 && index < array.length ? array[index] : null;
   }
}


