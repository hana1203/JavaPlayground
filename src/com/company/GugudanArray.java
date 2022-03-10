package com.company;

public class GugudanArray {
    public static void main(String[] args) {
        int dan = 3;
        int[] result = new int[9];
        //System.out.println(result.length); //9
        for (int i=0; i < result.length; i++) {
            result[i] = dan * (i+1);
            System.out.println(dan + "x" + (i+1) + " = " +result[i]);
        }
        //for (int i=1; i <= result.length; i++) // 이렇게짜면 index error 에러남.

    }
}
