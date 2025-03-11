package java8.streams;


//👉 Problem:
//You have a list of numbers: [10, 15, 20, 25, 30, 35, 40].
//        ✅ Task:
//        1️⃣ Filter numbers that are divisible by 5.
//        2️⃣ Square them.
//        3️⃣ Sort them in descending order.
//        4️⃣ Print the result.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 34,25, 3,52, 20, 40);

        // 1️⃣ Filter numbers that are divisible by 5.
        List<Integer> numbersDivisibleBy5 = numbers.stream().filter(x -> x % 5 == 0).toList();
        System.out.println(numbersDivisibleBy5);

        //error ( toList is immutable)
//        numbersDivisibleBy5.add(55);
//        System.out.println(numbersDivisibleBy5);

        // 2️⃣ Square them.
        List<Integer> squareOfNumbers = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(squareOfNumbers);

        //collect(Collectors.toList()) -> is mutable
        squareOfNumbers.add(1);
        System.out.println(squareOfNumbers);

        //3️⃣ Sort them in descending order.
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println(sortedNumbers);

        //Sum using reduce
        System.out.println("Sum: "+numbers.stream().reduce(0, Integer::sum));

        //max value
        System.out.println("Max: "+ numbers.stream().reduce(0,(a,b) -> a > b ? a:b));
    }
}
