package AccessModifiers;

public class TestProtected {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        obj.showProtected(); // ✅ Works because it's in the same package
    }
}
