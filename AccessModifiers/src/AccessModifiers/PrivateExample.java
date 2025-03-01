package AccessModifiers;

class PrivateExample {
    private int secretCode = 1234; // Private variable

    // Private method
    private void showSecret() {
        System.out.println("Secret Code is: " + secretCode);
    }

    // Public method to access private variable
    public void accessPrivateMethod() {
        showSecret(); // Calling private method within the same class
    }
}
