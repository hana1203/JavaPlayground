package com.company;

import java.util.Scanner;

public class CalendarPrompt {
    public static void main(String[] args) {
        CalendarPrompt p = new CalendarPrompt();
        p.runPrompt();
    }

    private final static String PROMPT = "month>";
    public int parseDay(String week){
        if (week.equals("SU")) return 0;
        else if (week.equals("MO")) return 1;
        else if (week.equals("TU")) return 2;
        else if (week.equals("WE")) return 3;
        else if (week.equals("TH")) return 4;
        else if (week.equals("FR")) return 5;
        else if (week.equals("SA")) return 6;
        return 0;
    }


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
            System.out.println("1일의 첫번째 요일을 입력하세요 (SU, MO, TU, WE, TH, FR, SA)? ");
            String day = scan.next();
            int dayOfWeek = parseDay(day);

            if (month <= 0) {
                break;
            }
            if (month > 12) {
                continue;
            }
            i++;
            cal.printCalendar(year, month, dayOfWeek);
            System.out.println();
        }
        System.out.println("bye~");
        scan.close();

    }


}
