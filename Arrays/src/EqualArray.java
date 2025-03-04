import java.util.Arrays;

public class EqualArray {
    private static void check(int a[], int b[]) {
            boolean res = true;
            if (a.length == b.length) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] != b[i]) {
                        res = false;
                        break;
                    }
                }
            } else {
                res = false;
            }
            if (res) {
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
        }
        public static void main(String[] args) {
            int a[] = { 10, 20, 30 };
            int b[] = { 10, 20, 30 };
            check(a, b);
            int c[] = { 10, 20, 30 };
            int d[] = { 45, 50, 55, 60, 65 };
            check(c, d);
        }
    }


