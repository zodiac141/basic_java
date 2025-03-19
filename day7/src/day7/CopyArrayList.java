package day7;

import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        ArrayList<Integer> copyList = new ArrayList<>(list);
        System.out.println(copyList);
    }
}
