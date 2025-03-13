package java8.parallelStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello World", "Java Streams");
        List<String> words = list.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(",")))
                .map(String::toUpperCase)
                .toList();

        System.out.println(words);
    }
}
