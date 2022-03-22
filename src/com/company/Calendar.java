package com.company;

public class Calendar {

    private static final int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] leapyearDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //해당년도가 윤년인지 아닌지 true false 리턴값주기
    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        return false;
    }

    public int getNumdaysOfMonth(int year, int month) {
        if (isLeapYear(year)){
            return leapyearDays[month-1];
        } else {
            return numDays[month-1];
        }
    }

//    //캘린더 출력하기
//    public void printCalendar(int year, int month) {
//        System.out.printf("  <<%3d %3d>>\n", year, month);
//        System.out.println("일 월 화 수 목 금 토");
//        System.out.println("--------------------");
//        int numDays = getNumdaysOfMonth(year,  month);
//        for (int i =1; i <= numDays; i++){
//            System.out.printf("%3d",i);
//            if (i % 7 ==0){
//                System.out.println();
//            }
//        }

    //캘린더 출력하기 요일입력받은 이후.
    public void printCalendar(int year, int month, int dayOfWeek) {
        System.out.printf("  <<%3d %3d>>\n", year, month);
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        int numDays = getNumdaysOfMonth(year, month);
        int count = 7 - dayOfWeek;

        //count변수는 일요일은 7개출력, 월요일 6개, 화요일 5개 ...
        //여기서 dayOfWeek 변수는 화요일의 경우 2
        //print blank space
        for (int k=0; k < dayOfWeek; k++) {
            System.out.printf("   "); //하루에 세칸 띄기 했으니까 빈칸 세칸 띄기.
        }
        //print first line
        for (int j=1; j < count; j++){
            System.out.printf("%3d", j);
        }

        //print second line to the end
        for (int i=count; i <= numDays; i++){ //시작을 count 로 바꿈.
            System.out.printf("%3d", i);
            if (i % 7 ==count){
                System.out.println();
            }
        }


//        System.out.println(" 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n");
    }

// Calendar 에 내용이 복잡해지고 많아지니 기능 분리. 새로 CalendarMain 클래스파일 만듬.
//    public static void main(String[] args) {
////        //입력받은 달의 날짜수 구하기.
////        Scanner scan = new Scanner(System.in);
////        System.out.println("which month? ");
////        int month = scan.nextInt();
////        int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
////        System.out.printf("%d월은 %d일까지 있습니다\n", month, numDays[month-1]);
//
//        //반복 입력
//        Scanner scan = new Scanner(System.in);
//        System.out.println("반복횟수를 입력하세요.");
//        int numOfIteration = scan.nextInt();
//        int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        System.out.println("월을 입력하세요. ");
//        int month = 0;
//
//        //for 활용
////        for (int i=0; i<numOfIteration; i++) {
////            month = scan.nextInt();
////            System.out.printf("%d월은 %d 일까지 있습니다\n", month, numDays[month-1]);
//        //while 활용 0보다 작은수 입력받는 경우 while문 탈출하기. 12보다 큰 수 입력받으면 다시 while 문 계속 돌게하기.
//        int i = 0;
//        String PROMPT = "cal month> ";
//        while (i < numOfIteration) {
//            System.out.print(PROMPT);
//            month = scan.nextInt();
//            if (month <= 0) {
//                break;
//            }
//            if (month > 12) {
//                continue;
//            }
//
//            //입력받은 해당월의 달력 출력하기
//            if (numDays[month-1] == 28) {
//                System.out.println(" 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n");
//            }
//            else if (numDays[month-1] == 30) {
//                System.out.println(" 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30");
//            }
//            else if (numDays[month-1] == 31) {
//                System.out.println(" 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31");
//            }
//            //////
//            i++;
//        }
//        System.out.println("bye~");
//        scan.close();
//    }

}





