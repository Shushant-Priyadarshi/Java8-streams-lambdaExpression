package java8.functionalInterfaces.methodRefrence;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void printMessge(String message){
        System.out.println(message);
    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("Shushant", "Prisha", "MJ");
        //list.forEach(x -> System.out.println(x));

        //Method Reference
        // list.forEach(System.out::println);

        printMessge("Hello world 1");

        //Through Consumer
        Consumer<String> printMessage2 = x -> System.out.println(x);
        printMessage2.accept("Hello world 2");

        //Method Reference
        Consumer<String> printMessage3 = Main::printMessge;
        printMessage3.accept("Hello world 3");

    }
}
