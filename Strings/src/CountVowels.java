import java.util.Arrays;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        int isvowel = 0;
        int notvowel = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char[] ch = str.toCharArray();
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                isvowel++;
            }
            else
            {
                notvowel++;
            }
            
        }
        System.out.println("the number of vowels in the string are " + isvowel);
        System.out.println("the number of consonants in the string are " + notvowel);
    }
}
