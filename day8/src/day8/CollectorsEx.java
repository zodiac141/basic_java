package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsEx {
    public List<String> removeemptystrings(List<String> strings){
        List<String> filteredList = strings.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());

        System.out.println("the filtered list is :" + filteredList);
        return filteredList;
    }

    public List<String> extractStrings (List<String> strings){
        List<String> extractedStrings=strings.stream().filter(s->s.length()>4).collect(Collectors.toList());
        System.out.println("the extracted strings is :" + extractedStrings);
        return extractedStrings;
    }

    public static void main (String[] args){

        List<String> strings=new ArrayList<>();
        strings.add("Rameshwa");
        strings.add("Suresh");
        strings.add("Rajesh");
        strings.add("Mahesh");
        strings.add("ui");
        strings.add("uiu");
        strings.add("");

        CollectorsEx collectorex=new CollectorsEx();

        List<String> filteredList = collectorex.removeemptystrings(strings);
        List<String> extractedStrings = collectorex.extractStrings(strings);
    }

}



