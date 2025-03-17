package day5;

public class TestWaitNotify {
    public static void main(String[] args) {
        Transactions trans=new Transactions();
       Runnable r1=()->{
           trans.withdraw(1000);
       };
       Runnable r2=()->{
           trans.deposit(1500);
       };
       Thread withdraw=new Thread(r1);
       Thread deposit=new Thread(r2);
       withdraw.start();
       deposit.start();
    }
}