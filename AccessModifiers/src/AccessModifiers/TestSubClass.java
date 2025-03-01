package AccessModifiers;

public class TestSubClass {
    public static void main(String[] args) {
        SubClass subObj = new SubClass(); // Object of SubClass

        subObj.display(); // Calls overridden method
        subObj.exceptionHandlingDemo(); // Demonstrates exception handling
    }
}
