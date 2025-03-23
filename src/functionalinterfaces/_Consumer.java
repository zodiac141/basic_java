package functionalinterfaces;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer john=new Customer("John","1234");
        GreetCustomer(john);

        //consumer functional interface
        GreetCustomerConsumer.accept(john);

}
    static Consumer<Customer>GreetCustomerConsumer=customer ->
            System.out.println("Hello "+customer.name +
                    "\nYour number is "+customer.number);


   static class Customer{
        private final String name;
        private final String number;

        public Customer(String name, String number) {
            this.name = name;
            this.number = number;
        }
    }
    static void GreetCustomer(Customer customer){
        System.out.println("Hello "+customer.name);
        System.out.println("Your number is "+customer.number);
    }
   }
