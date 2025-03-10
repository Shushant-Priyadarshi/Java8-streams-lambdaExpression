package java8.functionalInterfaces.imp;

import java.util.function.*;

public class SomeImportantConcepts {
    public static void main(String[] args) {
        //Predicate
        Predicate<Integer> isEven = x -> x % 2 == 0;

        //Function
        Function<Integer,Integer> doubleIt = x -> x * 2;

        //Consumer
        Consumer<Integer> printNum = x -> System.out.println(x);

        //Supplier
        Supplier<Integer> inputNum = () -> 2;

        if(isEven.test(inputNum.get())){
            Integer result = doubleIt.apply(inputNum.get());
            printNum.accept(result);
        }

        //BiPredicate , BiConsumer , BiFunction
        BiPredicate<Integer,Integer> isSumEven = (x,y) -> (x+y)%2 ==0;
        BiConsumer<String,Integer> justPrint = (x,y) -> {
            System.out.println(y+": "+x);
        };
        BiFunction<String,String,Integer> lengthOfStrings = (x,y) -> (x+y).length();

        System.out.println(isSumEven.test(20,13));
        justPrint.accept("Prisha",23);
        System.out.println(lengthOfStrings.apply("a","bc"));

        //UnaryOperator
        UnaryOperator<Integer> isEven2 = x -> x * 2;
        BinaryOperator<Integer> sum = (x,y) -> x+y;
    }
}
