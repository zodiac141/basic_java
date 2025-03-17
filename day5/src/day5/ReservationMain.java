package day5;

public class ReservationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Berth Reservation !!");
        Thread user1=new Thread(new Reservation(50),"User1");
        Thread user2=new Thread(new Reservation(20),"User2");
        Thread user3=new Thread(new Reservation(30),"User3");
        Thread user4=new Thread(new Reservation(10),"User4");
        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}
