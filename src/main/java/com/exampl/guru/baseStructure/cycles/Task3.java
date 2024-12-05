package com.exampl.guru.baseStructure.cycles;

public class Task3 {
    //Найти среди чисел от 50 до 70 второе просто число
    public static void main(String[] args) {
        int startNum=50;
        int endNum=70;
        int secondPrime=0;
        int count=0;
        for(int i=startNum; i<endNum; i++){
            boolean isComposite=false;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    isComposite=true;
                    break;
                }
            }
            if(!isComposite){
                count++;
                if(count==2){
                    secondPrime=i;
                    break;
                }
            }
        }
        System.out.println(secondPrime);
    }
}
