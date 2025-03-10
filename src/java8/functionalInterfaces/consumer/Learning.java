package java8.functionalInterfaces.basic.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Learning {
    public static void main(String[] args) {
        String name = "Shsuhant";
        System.out.println(name);

        Consumer<String> print = x -> System.out.println(x);
        print.accept("Prisha");

        List<Integer> list = Arrays.asList(23, 43, 12, 43);
        Consumer<List<Integer>> printList = x -> {
            for(int i :x){
                System.out.println(i);
            }
        };

        printList.accept(list);
    }
}
