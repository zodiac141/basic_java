public class Variable_scope {
    public static void main(String[] args) {
        int x;
        x=10;
        {
            int y = 20;
            System.out.println(x + "" + y);
        }
            System.out.println(x+" "+y);
        }
    }
}
