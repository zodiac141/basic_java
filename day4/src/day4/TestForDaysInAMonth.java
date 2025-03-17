package day4;

import java.util.Scanner;

enum Months{
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}
public class TestForDaysInAMonth {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the month : ");
         Months month=Months.valueOf(sc.next());
         switch (month) {
             case JANUARY:
             case MARCH:
             case MAY:
             case JULY:
             case AUGUST:
             case OCTOBER:
             case DECEMBER:
                 System.out.println("31 days");
                 break;
             case APRIL:
             case JUNE:
             case SEPTEMBER:
             case NOVEMBER:
                 System.out.println("30 days");
                 break;
             case FEBRUARY:
                 System.out.println("Enter the year : ");
                 int year = sc.nextInt();
                 if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                     System.out.println("29 days");
                     break;
                 } else {
                     System.out.println("28 days");
                     break;
                 }
         }
     }
}

