package com.exampl.arrayCollection;

public class Task127 {
    //Дерево Фенвика, или двоичное индексированное дерево
    public static void main(String[] args) {

    }
}
 class FenwickTree{
    private final  int n;
    private  long[] tree;
    private long[] values;

     public FenwickTree(long[] tree) {
         values[0]=0L;
         this.n=values.length;
         tree=values.clone();
         for(int i=1;i<n;i++){
             int parent =i+lsb(i);
             if (parent<n){
                 tree[parent]+=tree[i];
             }
         }
     }

     private static  int lsb(int i) {
         return i&-i;

     }
 }