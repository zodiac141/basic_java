package DifferentPackage;

import AccessModifiers.ProtectedExample; // ✅ Importing public class from another package

// Extending ProtectedExample from another package
public class DifferentPackageSubClass extends ProtectedExample {
    public void accessProtectedFromSubclass() {
        System.out.println("Accessing Protected Number from Different Package: " + protectedNumber);
    }
}
