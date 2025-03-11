package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("shushant", "manjistha");

        //uppercase logic before streams
        List<String> upperCaseNamesArray = new ArrayList<>();
        for(String name : names){
            upperCaseNamesArray.add( name.toUpperCase());
        }
        System.out.println("names: "+names);
        System.out.println("uppercase: "+upperCaseNamesArray);

        //with streams
        List<String> uppercaseWithStreams = names.stream().map(String::toUpperCase).toList();
        System.out.println("names with streams: "+uppercaseWithStreams);
    }
}
