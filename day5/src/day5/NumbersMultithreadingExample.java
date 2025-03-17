package day5;
public class NumbersMultithreadingExample implements Runnable {
    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

        }

    }
}