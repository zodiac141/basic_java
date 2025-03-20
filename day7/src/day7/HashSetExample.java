package day7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> intset=new HashSet<>();
        intset.add(1);
        intset.add(2);
        intset.add(3);
        intset.add(4);
        intset.add(5);
        intset.add(6);
        intset.add(7);
        intset.add(8);
        System.out.println(intset);

        HashSet<String> strset=new HashSet<>();
        strset.add("Faraan");
        strset.add("Hashmi");
        strset.add("Suisui");
        strset.add("Ahmed");
        System.out.println(strset);

        LinkedHashSet<String> lstrset=new LinkedHashSet<>();
        lstrset.add("nexturn");
        lstrset.add("Hashmi");
        lstrset.add("Suisui");
        lstrset.add("Ahmed");
        System.out.println(lstrset);

        TreeSet<String> tstrset=new TreeSet<>();
        tstrset.add("nexturn");
        tstrset.add("java");
        tstrset.add("nicmar");


    }
}
