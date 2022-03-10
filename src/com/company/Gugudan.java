package com.company;
import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
//	// 2단, 3단
//        int i;
//        int dan2 = 2;
//        for (i=1; i<=9 ;i++)
//            System.out.println(dan2+" x "+i+" = "+(dan2*i));
//        System.out.println();
//        int dan3 = 3;
//        for (i=1; i<=9 ;i++)
//            System.out.println(dan3+" x "+i+" = "+(dan3*i));

    // 단을 유저에게 입력받기

        while (true){
            System.out.println("구구단 몇단?: ");
            Scanner scanner = new Scanner(System.in);
            int dan = scanner.nextInt();
            System.out.println("단: "+ dan);

            if (dan < 2) {
                System.out.println("2단 이상부터 계산합니다. 다시 입력하세요. ");
            }

            else if (dan > 9) {
                System.out.println("9단보다 높아 계산할수 없습니다. 다시 입력하세요. ");
            }

            else
            {
                int i = 1;
                int number;
                int num;
                System.out.println("=== while 사용 ===");
                while (i < 10) {
                    number = dan * i;
                    System.out.println(dan + " x " + i + " = " + number);
                    i++;
                }

                System.out.println();
                System.out.println("=== for 사용 ===");
                for (int k = 1; k < 10;k++) {
                    num = dan * k;
                    System.out.println(dan + " x " + k + " = " + num);
                }
            }
        }






    }
}
