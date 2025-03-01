package DifferentPackage;

public class TestDifferentPackage {
    public static void main(String[] args) {
        DifferentPackageSubClass obj = new DifferentPackageSubClass();
        obj.accessProtectedFromSubclass(); // ✅ Works because of inheritance
    }
}
