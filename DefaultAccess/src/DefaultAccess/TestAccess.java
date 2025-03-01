package DefaultAccess;

public class TestAccess {
    public static void main(String[] args) {
        DefaultAccess obj = new DefaultAccess(); // Object Creation
        obj.display(); // Calling default method (Works because it's in the same package)

        // Trying to access private variable via getter & setter
        System.out.println("Initial Secret Code: " + obj.getSecretCode());
        obj.setSecretCode(5678); // Updating private variable using setter
        System.out.println("Updated Secret Code: " + obj.getSecretCode());
    }
}
