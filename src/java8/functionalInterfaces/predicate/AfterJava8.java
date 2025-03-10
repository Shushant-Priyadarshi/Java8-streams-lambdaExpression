package java8.functionalInterfaces.predicate;

import java.util.function.Predicate;

//Represents a predicate (boolean-valued function) of one argument.
//This is a functional interface whose functional method is test(Object).

//‼️‼️USE PREDICATE IF YOU WANT TO CHECK SOMETHING......

public class AfterJava8 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 ==0;

        Predicate<String> startsWithA = name -> name.toUpperCase().startsWith("A");

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(43));
    }
}
