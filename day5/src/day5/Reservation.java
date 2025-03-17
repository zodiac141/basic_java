package day5;

public class Reservation implements Runnable{
   static int availableberths=100;
  int requestedBerths;
    public Reservation(int requestedBerths) {
        this.requestedBerths = requestedBerths;
}

    @Override
    public  void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("welcome " + threadName);
        synchronized (Reservation.class) {
            if (availableberths == 0) {
                System.out.println("no berths available");
                return;
            }
            System.out.println(threadName + " requested " + requestedBerths + " berths");
            if (availableberths >= requestedBerths) {
                availableberths -= requestedBerths;
                System.out.println("Reservation successful for " + threadName + ". " + availableberths + " berths available");
            } else {
                System.out.println("Not enough berths available for " + threadName + " .Only " + availableberths + " berths available");
            }


        }
    }
}
