package AccessModifiers;

public class TestPrivate {
    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();

        // obj.secretCode; // ❌ Error: Cannot access private variable
        // obj.showSecret(); // ❌ Error: Cannot access private method

        obj.accessPrivateMethod(); // ✅ Works because it calls a public method
    }
}
