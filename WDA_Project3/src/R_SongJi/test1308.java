package beakjoon;

import java.util.Scanner;

public class test1308 {
    public static void main(String[] args) {
        int finalyear = 0;
        int finalmonth = 0;
        int finalday = 0;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("오늘 날짜를 입력하시오: ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();  
        System.out.print("캠프 날짜를 입력하세요: ");
        int year2 = sc.nextInt();
        int month2 = sc.nextInt();
        int day2 = sc.nextInt();  
        System.out.print("일을 입력: ");  
                                       
      if(((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)){
        finalyear = year2 - year;
        if (month2 < month){
            finalmonth = 12 + (month2 - month);
            finalyear = finalyear - 1;
        } else if(month2 > month) {
            finalmonth = month2 - month;
        }
        if (day2 < day) {
            finalday = 31 + (day2 - day);
            finalmonth = finalmonth - 1;
        }else if (day2 > day) {
            finalday = day2 - day;
        }
        total = finalyear * 365 + finalmonth * 31 + finalday;
          System.out.println("D - " + total);        
    }
    }
}
