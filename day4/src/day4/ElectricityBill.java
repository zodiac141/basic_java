package day4;
import java.util.Scanner;


public class ElectricityBill {
    private String serviceNumber;
    private double previous;
    private double present;
    private double units;

    public ElectricityBill(String serviceNumber, double previous, double present) {
        this.serviceNumber = serviceNumber;
        this.previous = previous;
        this.present = present;
        this.units = present - previous;
    }

    public void calculateBill() {
        char category = serviceNumber.charAt(0);
        double bill = 0;
        if (category == 'A') {
            if (units <= 50) {
                bill = units * 1.45 + 25;
            } else {
                bill = 50 * 1.45 + (units - 50) * 2.6 + 30;
            }
        } else if (category == 'B') {
            if (units <= 100) {
                bill = units * 3.3 + 25;
            } else {
                bill = 100 * 3.3 + (units - 100) * 4.3 + 50;
            }
        } else if (category == 'C') {
            if (units <= 200) {
                bill = units * 5.00 + 50;
            } else if (units <= 300) {
                bill = 200 * 5.00 + (units - 200) * 7.2 + 60;
            } else if (units <= 400) {
                bill = 200 * 5.00 + 100 * 7.2 + (units - 300) * 8.5 + 80;
            } else if (units <= 800) {
                bill = 200 * 5.00 + 100 * 7.2 + 100 * 8.5 + (units - 400) * 9 + 80;
            } else {
                bill = 200 * 5.00 + 100 * 7.2 + 100 * 8.5 + 400 * 9 + (units - 800) * 9.5 + 80;
            }
        }
        System.out.println("Service number : " + serviceNumber);
        System.out.println("Previous units : " + previous);
        System.out.println("Present units : " + present);
        System.out.println("Total units consumed : " + units);
        System.out.printf("Net bill to be paid : %.2f\n", bill);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serviceNumber = scanner.nextLine();
        double previous = scanner.nextDouble();
        double present = scanner.nextDouble();
        ElectricityBill billObj = new ElectricityBill(serviceNumber, previous, present);
        billObj.calculateBill();

        scanner.close();
    }
}