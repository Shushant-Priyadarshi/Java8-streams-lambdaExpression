package java8.parallelStreams;

import java.util.Arrays;
import java.util.List;

public class ParallelStream2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.parallelStream()
                .forEach(num -> System.out.println(Thread.currentThread().getName() + " → " + num));

    }
}
