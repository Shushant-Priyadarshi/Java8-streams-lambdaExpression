package java8.parallelStreams;

import java.util.stream.Stream;

public class StreamIterator {

    //Stream.iterate(initialValue, condition, nextValue)

    public static void main(String[] args) {
        Stream.iterate(3,x -> x+1).limit(3).forEach(System.out::println); //3,4,5
        Stream.iterate(2,x-> x <= 10 ,x -> x*2).forEach(System.out::println);//2,4,8
    }
}
