package day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {
        HashMap<String,String> items=new HashMap<>();
        items.put("nexturn","java");
        items.put("hashmi","python");
        items.put("ahmed","php");
        System.out.println(items);
        System.out.println(items.get("ahmed"));
        Set<Map.Entry<String,String>> set=items.entrySet();
        Iterator<Map.Entry<String,String>> itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry<String,String> entry=itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
