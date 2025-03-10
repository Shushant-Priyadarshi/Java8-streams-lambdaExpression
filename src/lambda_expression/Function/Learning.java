package lambda_expression.Function;

import java.util.function.Function;

//Represents a function that accepts one argument and produces a result.
//This is a functional interface whose functional method is apply(Object

public class Learning {
    public static void main(String[] args) {
        Function<Integer,Integer> doubleIt = x -> x * 2;
        Function<Integer,Integer> tripleIt = x -> x * 3;

        System.out.println(doubleIt.apply(100)); //200
        System.out.println(doubleIt.apply(400)); //800

        //first double then triple
        System.out.println(doubleIt.andThen(tripleIt).apply(2)); //12

        //first triple then double
        System.out.println(doubleIt.compose(tripleIt).apply(2)); //12

        //returns same value that has been inputted
        Function<Integer,Integer> identity = Function.identity();
        Integer result = identity.apply(23);
        System.out.println(result);

    }
}
