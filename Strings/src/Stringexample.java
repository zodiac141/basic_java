public class Stringexample {
    public static void main(String[] args) {
        String s1 = "faraan";
        s1 = s1.concat(" ahmed");
        s1 = s1.concat(" hashmi");
        System.out.println(s1);
        s1.intern();
        System.out.println(s1.intern());
        s1.hashCode();
        System.out.println(s1.hashCode());
    }
}
 //str.concat(" ahmed");   This does NOT modify the original string
// If we want to change it, we must assign it explicitly