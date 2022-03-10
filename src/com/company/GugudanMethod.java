package com.company;
//메소드는 항상 입력과 출력이 존재 입력을 받아서 입력을 받아서 출력해냄.

public class GugudanMethod {
//    public static int[] calculate(int dan) {
//        int[] result = new int[9];

//    ////Q1. 사용자가 입력한 값에 따른 구구단을 계산해 출력
//        public static int[] calculate(int dan){
//            int[] result = new int[dan];
//    ////
//
//        for (int i =0; i < result.length; i++){
//            result[i] = dan * (i+1);
//            System.out.println(dan + "x" + (i+1) + " = " +result[i]);
//        }
//        return result;

        ////Q2. 사용자가 입력한 두 값에 따라 구구단 몇단을 몇 줄까지 출력
        public static int[] calculate(int first, int second){
            int[] result = new int[second];
            for (int j=2; j <= first; j++) {
                for (int i=0; i < result.length; i++) {
                    result[i] = j * (i + 1);
                    System.out.println(j + "x" + (i + 1) + " = " + result[i]);
                }
            }
            return result;
    }

// 클래스 분리를 위해서 주석처리
//    public static void main(String[] args) {
//        for (int j = 2; j < 10; j++)
//            calculate(j);
//    }


}
