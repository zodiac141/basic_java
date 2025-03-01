package DefaultAccess;

class SubClass extends DefaultAccess {  // Inherits from DefaultAccess

    // Overriding display() method
    @Override
    void display() {
        System.out.println("Overridden display method from SubClass.");
    }

    // Demonstrating exception handling
    public void exceptionHandlingDemo() {
        try {
            int result = 10 / 0; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed!");
        }
    }
}
