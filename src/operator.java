public class operator {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Assign: "+a);
        a = a+3;
        System.out.println("Sum: "+a);
        a = a-3;
        System.out.println("Subtract: "+a);
        a *= 3;
        System.out.println("Mul: "+a);
        a /=3;
        System.out.println("div: "+a);
        a %=3;
        System.out.println("Mod: "+a);
        a &= 3;
        System.out.println("AND: "+a);
        a |=3;
        System.out.println("OR: "+a);
        a ^=3;
        System.out.println("XOR: "+a);
        a >>= 3;
        System.out.println("Left Shift: "+a);
        a <<=3;
        System.out.println("Right Shift: "+a);
    }
}


