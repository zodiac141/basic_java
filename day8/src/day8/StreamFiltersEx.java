package day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFiltersEx {

    public int StringListCount (List<String> strings){
          int filteredList = (int) strings.stream().filter(s->s.length()>4).count();

          System.out.println("the filtered list is :" + filteredList);
          return filteredList;
    }

    public int countEmptyStrings (List<String> strings){
        int count=strings.stream().filter(s->s.isEmpty()).collect(Collectors.toList()).size();
        System.out.println("the count of empty strings is :" + count);
        return count;
    }

    public static void main (String[] args){

        List<String> strings=new ArrayList<>();
        strings.add("Rameshwa");
        strings.add("Suresh");
        strings.add("Rajesh");
        strings.add("Mahesh");
        strings.add("");

        StreamFiltersEx stringmanipulator=new StreamFiltersEx();

        int filter= stringmanipulator.StringListCount(strings);
       int countempty= stringmanipulator.countEmptyStrings(strings);
    }

}
