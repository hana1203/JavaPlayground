package com.company;

public class CalendarExercise {
    private static final int maxDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int LeapMaxDays[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year){
        if (year % 4 ==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; //윤년
                }
                return false; //평년
            }
            return true; //윤년
        }
        else
            return false;
    }
    public int getMaxDays(int year, int month){
        if (isLeapYear(year))
            return LeapMaxDays[month-1];
        else
            return maxDays[month-1];
    }

    public void PrintCalendar(int year, int month){
        System.out.printf(" <<%2d년 %2d월>>", year, month);
        System.out.println();
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        int numOfMaxDays = getMaxDays(year, month);
        for (int i=1; i<=numOfMaxDays; i++) {
            System.out.printf("%3d",i);
            if (i%7 ==0) {
                System.out.println();
            }
        }
        System.out.println();
    }


}
