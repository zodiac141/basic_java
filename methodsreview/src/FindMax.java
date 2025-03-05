public class FindMax {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int max = findMax(num1, num2);
        System.out.println("The maximum of " + num1 + " and " + num2 + " is " + max);
    }
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}