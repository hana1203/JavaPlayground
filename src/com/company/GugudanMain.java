package com.company;
import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        ////Q1. 사용자가 입력한 값에 따 구구단을 계산해 출력 ex) 19 입력시 2*1에서 19*19까지 출력.
//        Scanner scan = new Scanner(System.in);
//        System.out.println("구구단 몇단? 똑같은 구구단 단 수의 길이만큼 출력해줌");
//        int dan = scan.nextInt();
//        GugudanMethod.calculate(dan);
        ////

        ////Q2. 사용자가 입력한 두 값에 따라 구구단 몇단을 몇 줄까지 출력
        Scanner scan = new Scanner(System.in);
        System.out.println("구구단 몇단을 몇줄까지? 콤마와 함께 입력 ex) 4,5입력시 2단부터 4단까지 4*5까지 출력");
        String inputValue = scan.nextLine();
        String[] splitValue = inputValue.split(","); //delimeter 콤마 기준으로 분리
        int first = Integer.parseInt(splitValue[0]);
        int second = Integer.parseInt(splitValue[1]);

        GugudanMethod.calculate(first, second);
        ////


//        for (int j = 2; j < 10; j++)
//            GugudanMethod.calculate(j);
    }

}
