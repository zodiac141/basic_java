public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Reversed string: " + reverseString(str));
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}