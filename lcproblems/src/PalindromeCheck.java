
public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 12321;
        String s = "madam";
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }


        if (isPalindrome(s)) {
            System.out.println(s + " is a palindrome string");
        } else {
            System.out.println(s + " is not a palindrome string");
        }
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
        if(num<0) return false;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}