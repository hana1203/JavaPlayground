package com.company;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
//        //캘린더 출력하기
//        System.out.println("일 월 화 수 목 금 토");
//        System.out.println("--------------------");
//        System.out.println(" 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n");
//
//
//        //입력받은 달의 날짜수 구하기.
//        Scanner scan = new Scanner(System.in);
//        System.out.println("which month? ");
//        int month = scan.nextInt();
//        int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        System.out.printf("%d월은 %d일까지 있습니다\n", month, numDays[month-1]);

         //반복 입력
        Scanner scan = new Scanner(System.in);
        System.out.println("반복횟수를 입력하세요.");
        int numOfIteration = scan.nextInt();
        int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("월을 입력하세요. ");
        int month = 0;
        //for 활용
//        for (int i=0; i<numOfIteration; i++) {
//            month = scan.nextInt();
//            System.out.printf("%d월은 %d 일까지 있습니다\n", month, numDays[month-1]);
        //while 활용
        int i = 0;
        while (i < numOfIteration) {
            month = scan.nextInt();
            i++;
            System.out.printf("%d월은 %d일까지 있습니다. ", month, numDays[month-1]);
        }




    }

}
