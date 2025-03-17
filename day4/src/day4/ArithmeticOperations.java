package day4;

public class ArithmeticOperations{
   public static void main(String[] args) {
       Multiply mul=(x,y)->(x*y);
       Division div=(a,b)->(a/b);
       System.out.println("the result of multiplication is :"+mul.multiply(5, 3));
       System.out.println("the result of division is :"+div.divide(6, 3));
   }

}
