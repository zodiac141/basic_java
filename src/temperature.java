import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        String weather;
        if (temperature > 30) {
            weather = "Hot";
        } else if (temperature >= 20) {
            weather = "Warm";
        } else if (temperature >= 10) {
            weather = "Moderate";
        } else {
            weather = "Cold";
        }
        System.out.println("The weather is: " + weather);
        scanner.close();
    }
}
