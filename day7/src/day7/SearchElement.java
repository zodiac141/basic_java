package day7;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;
public class SearchElement {
    public static void main(String[] args) {
        LinkedList<Integer> newlist = new LinkedList<>();
        newlist.add(1);
        newlist.add(2);
        newlist.add(3);
        newlist.add(4);
        newlist.add(5);
        newlist.add(6);
        newlist.add(7);
        newlist.add(8);
        System.out.println(newlist);
        System.out.println(newlist.contains(5));
        System.out.println(newlist.contains(9));

        ArrayList<Integer> list = new ArrayList<>();
        Integer a[] = { 10, 20, 30, 40, 50 };
        list.addAll(Arrays.asList(a));
        System.out.println(list);
        System.out.println(list.contains(30));
        System.out.println(list.contains(60));
        }
    }

