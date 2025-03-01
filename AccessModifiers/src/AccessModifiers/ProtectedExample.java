package AccessModifiers;

public class ProtectedExample {  // ✅ Make this class public
    protected int protectedNumber = 2024; // Protected variable

    // Protected method
    protected void showProtected() {
        System.out.println("Protected Number is: " + protectedNumber);
    }
}
