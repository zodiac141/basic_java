public class add2strings {
    public static String addStrings(String num1, String num2) {
            StringBuilder result = new StringBuilder();
            int carry = 0;
            int i = num1.length() - 1;
            int j = num2.length() - 1;

            while (i >= 0 || j >= 0 || carry > 0) {
                int sum = carry;
                if (i >= 0) {
                    sum += num1.charAt(i--) - '0';
                }
                if (j >= 0) {
                    sum += num2.charAt(j--) - '0';
                }
                carry = sum / 10;
                result.append(sum % 10);
            }

            return result.reverse().toString();

        }
        //lc 415
    }

