package com.company;

import java.util.Scanner;

public class CalendarPrompt {
    public static void main(String[] args) {
        CalendarPrompt p = new CalendarPrompt();
        p.runPrompt();
    }

    private final static String PROMPT = "month>";
    public void runPrompt() {
        //반복 입력
        Scanner scan = new Scanner(System.in);
        Calendar cal = new Calendar();

        System.out.println("반복횟수를 입력하세요.");
        int numOfIteration = scan.nextInt();

        int month = 0;
        int year = 0;

        int i = 0;
        while (i < numOfIteration) {
            System.out.println("년도 입력하세요. ");
            year = scan.nextInt();
            System.out.println("월을 입력하세요. ");
            System.out.print(PROMPT);
            month = scan.nextInt();
            if (month <= 0) {
                break;
            }
            if (month > 12) {
                continue;
            }
            i++;
            cal.printCalendar(year, month);
            System.out.println();
        }
        System.out.println("bye~");
        scan.close();

    }


}
