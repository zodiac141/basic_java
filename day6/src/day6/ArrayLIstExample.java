package day6;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayLIstExample {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("faraan");
        list.add("hashmi");
        list.add("suisui");
        list.add(1,"ahmed");
        list.add(2);
        list.add(7);
        list.add(3,9);
        System.out.println(""+list);
        ListIterator it=list.listIterator();
       while (it.hasNext()){
           Object obj=it.next();
           if (obj instanceof Integer){
               System.out.print(obj+" ");
           }
        }


    }


}
