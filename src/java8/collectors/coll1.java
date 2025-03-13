package java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class coll1 {
    public static void main(String[] args) {

       //1️⃣ Convert a Stream into a List (toList())
        List<String> names = Arrays.asList("prisha","Rajneet","Manjistha","priya");
        List<String> pNames = names.stream().map(String::toUpperCase).filter(x -> x.startsWith("P")).collect(Collectors.toList());
        //System.out.println("P names: "+pNames);

        //2️⃣ Convert a Stream into a Set
        List<Integer> numbers = Arrays.asList(1, 2, 2, 1, 1, 3, 4, 4);
        Set<Integer> distinctNumbers = numbers.stream().collect(Collectors.toSet());
        //System.out.println(distinctNumbers);

        //Joining
        String concatinatedNames = names.stream().collect(Collectors.joining(", ","start "," end"));
        System.out.println(concatinatedNames);


    }
}
