package AccessModifiers;

class DefaultAccess {  // Default access class (Only accessible within the same package)

    private int secretCode = 1234; // Private variable

    // Default method (Accessible within package)
    void display() {
        System.out.println("This is a default access display method!");
    }

    // Getter for private variable
    public int getSecretCode() {
        return secretCode;
    }

    // Setter for private variable
    public void setSecretCode(int newCode) {
        if (newCode > 999) {
            this.secretCode = newCode;
        } else {
            System.out.println("Invalid Code! Code must be greater than 999.");
        }
    }
}
