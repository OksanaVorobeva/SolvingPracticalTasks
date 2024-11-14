package com.exampl.string;

public class Task22 {
    //Поиск наибольшего общего префикса

    public static void main(String[] args) {

        String[] rexts={"abc","abcd","abcde","ab","abcd","abcdef"};
        System.out.println(longestCommonPrefix(rexts));

    }

    public static  String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }

        int firstLen=strs[0].length();
        for(int prefixLen=0;prefixLen<firstLen;prefixLen++){
            char ch=strs[0].charAt(prefixLen);
            for(int i=1;i<strs.length;i++){
                if(prefixLen>=strs[i].length()|| ch!=strs[i].charAt(prefixLen)){
                    return strs[i].substring(0,prefixLen);
                }
            }
        }
        return strs[0];
    }
}
