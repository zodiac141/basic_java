package day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PhoneBookLog {
    public static List<Integer> getList(HashMap<Integer, String> phonebook) {
        List<Integer> phonenumber = new ArrayList<>();
        return phonenumber;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> phonebook = new HashMap<>();
        phonebook.put(12345555, "Ramesh");
        phonebook.put(94742836, "Suresh");
        phonebook.put(33552411, "Rajesh");
        phonebook.put(41236789, "Mahesh");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search in phonebook: ");
        String searchName = scanner.nextLine();

        List<Integer> phonenumber = getList(phonebook);
        for (Integer number : phonenumber) {
            String name = phonebook.get(number);
            if (name.equals(searchName)) {
                System.out.println("Phone number of " + searchName + " is " + number);
                break;
            }
        }
    }
}
