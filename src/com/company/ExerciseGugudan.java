package com.company;
//어제 만들었던 구구단 앱 힌트없이 한번 만들어보기.

import java.util.Scanner;
public class ExerciseGugudan {
    public static void main(String[] args) {

//        // Requirement1. 사용자 입력받으면 2단부터 입력받은 단까지 출력.
//        // ex) 19 입력시 2*1에서 2*19... 19*19까지 출력.
//        System.out.println("구구단 몇단?: ");
//        Scanner scan = new Scanner(System.in);
//        int dan = scan.nextInt();
//
//        int result[] = new int[dan];
//        for (int j=2; j <= result.length; j++) //2단부터 입력한 단까지 출력
//            for (int i=0; i < result.length; i++) //각 단의 입력받은 숫자의 줄까지 출력
//            {
//                result[i] = j * (i+1);
//                System.out.println(j+"x"+(i+1)+"="+result[i]);
//            }
//        ////

        //Requirement2. 사용자가 입력한 두 값에 따라 구구단 몇단을 몇 줄까지 출력
        System.out.println("구구단 몇단을 몇줄까지? 띄어쓰기와 함께 입력: ");
        Scanner scan = new Scanner(System.in);
        String inputValue = scan.nextLine();
        String[] splitValue = inputValue.split(" ");
        //왜 String 뒤에 바로 [] 배열표시를 하지? 위에선 int result[] 하고 변수옆에 [] 붙였는디..
        int first = Integer.parseInt(splitValue[0]);
        int second = Integer.parseInt(splitValue[1]);

        int dan[] = new int[first];
        int result[] = new int[second];
        for (int j = 2; j <= dan.length; j++)
            for (int i = 0; i < result.length; i++)
            {
                result[i] = j * (i+1);
                System.out.println(j+"x"+(i+1)+"="+result[i]);
            }
        ////



    }

}

