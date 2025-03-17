package day5;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1=new Thread(new NumbersMultithreadingExample());
        Thread t2=new Thread(new NumbersMultithreadingExample());
        Thread t3=new Thread(new NumbersMultithreadingExample());

    }
}
