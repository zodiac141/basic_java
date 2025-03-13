package day4;

public class Bus implements Vehicle {
    public static void main(String[] args) {
        Bus bus=new Bus();
        bus.wheels();
        bus.engines();
    }
    @Override
    public void wheels() {
     System.out.println("Bus has 6 wheels");
    }

    @Override
    public void engines() {
        System.out.println("Bus has 1 engine");

    }
}
