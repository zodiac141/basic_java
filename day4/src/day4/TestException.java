package day4;

public class TestException {
    public static void main(String[] args) {
        int x=7;
        int y=0;
        int arr[]={1,2,3,4,5,6};
        try{
            int z=x/y;
            System.out.println("Result is :"+z);
            System.out.println("Array element at index 4 is :"+arr[4]);
        }
        catch (ArithmeticException | IndexOutOfBoundsException e1){

        }
    }
}
