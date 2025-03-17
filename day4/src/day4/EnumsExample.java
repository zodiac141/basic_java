package day4;

import java.util.Scanner;

enum Week{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;}

public class EnumsExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day : ");
        Week day=Week.valueOf(sc.next());
        switch (day){
            case MONDAY, TUESDAY , WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("Working day");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }
}
