package com.exampl.taskGuru;

public class TaskCurse {
    public static void main(String[] args) {
        String s ="code";
        String s2="string";
        String s3="Practice";
        System.out.println(returneString(s));
        System.out.println(returneString(s2));
        System.out.println(returneString(s3));
    }

    public static String returneString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length()/2; i++) {
            for (int j = i + 1; j < str.length()/2; j++) {
                sb.append(str.charAt(j= str.length()/2-j));
                sb.append(str.charAt(i= str.length()/2-i));
            }
        }
        return sb.toString();
    }
}
