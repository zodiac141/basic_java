package day4;

public class Aeroplane implements Vehicle {
    public static void main(String[] args) {
        Aeroplane aeroplane=new Aeroplane();
        aeroplane.wheels();
        aeroplane.engines();
    }
    @Override
    public void wheels() {
    System.out.println("Aeroplane has 4 wheels");
    }

    @Override
    public void engines() {
    System.out.println("Aeroplane has 2 engines");
    }
}
