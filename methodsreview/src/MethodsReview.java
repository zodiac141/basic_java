/*
 * File: methodsreview.java
 *
 * Overview: This file provides a comprehensive review of methods in Java.
 *
 * What are methods?
 * Methods are blocks of code that perform a specific task. They are defined within a class
 * and can be invoked to perform actions, process data, or return values. Methods help to
 * organize code, promote reusability, and separate concerns.
 *
 * Types of methods in Java:
 *   1. Instance methods: Belong to an instance (object) of a class.
 *   2. Static methods: Belong to the class itself and can be called without creating an object.
 *   3. Overloaded methods: Multiple methods in the same class with the same name but different parameters.
 *   4. Abstract methods: Declared without an implementation in abstract classes or interfaces.
 *   5. Default methods: Methods in interfaces with a default implementation (introduced in Java 8).
 *   6. Final methods: Methods declared with the 'final' keyword that cannot be overridden in subclasses.
 *   7. Synchronized methods: Methods declared with the 'synchronized' keyword ensuring thread-safe execution.
 *
 * Exception Handling in Methods:
 *   - Methods can throw exceptions, which may be checked (must be declared) or unchecked (runtime exceptions).
 *   - Common exceptions related to method execution include:
 *       * ArithmeticException: e.g., division by zero.
 *       * NullPointerException: e.g., calling a method on a null object.
 *       * IllegalArgumentException: e.g., passing an inappropriate parameter.
 *       * AbstractMethodError: e.g., if an abstract method is not properly implemented.
 *   - Exception handling is done using try-catch blocks to catch and handle exceptions gracefully.
 *
 * The code below demonstrates:
 *   - A static method, an instance method, overloaded methods, a method that may throw an exception,
 *     a final method, and a synchronized method.
 *   - Examples of abstract methods (with an abstract class) and default methods (in an interface).
 */

public class MethodsReview {

    // Main method: entry point of the program.
    public static void main(String[] args) {
        System.out.println("=== Methods in Java Review ===");

        // Calling a static method (belongs to the class, not an instance).
        MethodsReview.staticMethodExample();

        // Creating an instance to call instance methods.
        MethodsReview instance = new MethodsReview();
        instance.instanceMethodExample();

        // Demonstrating overloaded methods: same method name but different parameter types.
        instance.overloadedMethod(10);
        instance.overloadedMethod("Hello Overload");

        // Demonstrating exception handling in methods.
        try {
            // This method may throw an ArithmeticException (division by zero).
            int result = instance.divide(10, 0);
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Demonstrating abstract methods:
        // Creating an instance of a concrete subclass of an abstract class.
        AbstractMethodClass concrete = new ConcreteClass();
        concrete.abstractMethod();

        // Demonstrating default method in an interface (Java 8+ feature).
        DefaultMethodInterface dmi = new DefaultMethodClass();
        dmi.defaultMethod();             // Calls the default method defined in the interface.
        dmi.abstractInterfaceMethod();   // Calls the implemented abstract method.

        // Demonstrating a final method (cannot be overridden by subclasses).
        instance.finalMethodExample();

        // Demonstrating a synchronized method (ensures thread-safe execution).
        instance.synchronizedMethodExample();
    }

    // -----------------------------------------------------------------------------------
    // Static Method Example:
    // - Belongs to the class and can be called without creating an object.
    public static void staticMethodExample() {
        System.out.println("Static method called.");
    }

    // -----------------------------------------------------------------------------------
    // Instance Method Example:
    // - Belongs to an instance of the class.
    public void instanceMethodExample() {
        System.out.println("Instance method called.");
    }

    // -----------------------------------------------------------------------------------
    // Overloaded Methods:
    // - Methods with the same name but different parameter lists.
    public void overloadedMethod(int num) {
        System.out.println("Overloaded method with integer parameter: " + num);
    }

    public void overloadedMethod(String message) {
        System.out.println("Overloaded method with string parameter: " + message);
    }

    // -----------------------------------------------------------------------------------
    // Method Demonstrating Exception Handling:
    // - Divides two integers and may throw an ArithmeticException (e.g., division by zero).
    public int divide(int a, int b) throws ArithmeticException {
        return a / b; // Throws ArithmeticException if b == 0.
    }

    // -----------------------------------------------------------------------------------
    // Final Method Example:
    // - Declared with the 'final' keyword.
    // - Cannot be overridden by any subclass.
    public final void finalMethodExample() {
        System.out.println("Final method called. This method cannot be overridden.");
    }

    // -----------------------------------------------------------------------------------
    // Synchronized Method Example:
    // - Declared with the 'synchronized' keyword.
    // - Ensures that only one thread can execute this method at a time, providing thread safety.
    public synchronized void synchronizedMethodExample() {
        System.out.println("Synchronized method called. Thread-safe execution.");
    }

    // -----------------------------------------------------------------------------------
    // Abstract Class and Abstract Method Example:
    // - Abstract classes cannot be instantiated and can contain abstract methods.
    // - Abstract methods are declared without an implementation.
    static abstract class AbstractMethodClass {
        // Abstract method declaration: must be implemented by a subclass.
        abstract void abstractMethod();
    }

    // Concrete subclass of AbstractMethodClass that provides an implementation for the abstract method.
    static class ConcreteClass extends AbstractMethodClass {
        @Override
        void abstractMethod() {
            System.out.println("Abstract method implemented in ConcreteClass.");
        }
    }

    // -----------------------------------------------------------------------------------
    // Interface with Default Method Example (Java 8+):
    // - Interfaces can contain default methods with a provided implementation.
    static interface DefaultMethodInterface {
        // Abstract method in the interface.
        void abstractInterfaceMethod();

        // Default method in the interface.
        default void defaultMethod() {
            System.out.println("Default method in interface called.");
        }
    }

    // Class implementing the interface with a default method.
    static class DefaultMethodClass implements DefaultMethodInterface {
        @Override
        public void abstractInterfaceMethod() {
            System.out.println("Implemented abstract interface method in DefaultMethodClass.");
        }
    }
}
