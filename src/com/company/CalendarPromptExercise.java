package com.company;
import java.util.Scanner;

public class CalendarPromptExercise {
    public void runPrompt(){
        CalendarExercise calex = new CalendarExercise();
        String PROMPT_YEAR = "year>";
        String PROMPT_MONTH = "month>";
        Scanner scan = new Scanner(System.in);
        System.out.println("반복 횟수 입력하세요 ");
        int repeat = scan.nextInt();
        int i =0;
        while (i < repeat) {
            System.out.println("년도 입력하세요 ");
            System.out.println(PROMPT_YEAR);
            int year = scan.nextInt();
            System.out.println("월 입력하세요 ");
            System.out.println(PROMPT_MONTH);
            int month = scan.nextInt();
            calex.PrintCalendar(year, month);
            i++;
            }
    }
    public static void main(String[] args) {
        CalendarPromptExercise calprompt = new CalendarPromptExercise();
        calprompt.runPrompt();
    }
}
