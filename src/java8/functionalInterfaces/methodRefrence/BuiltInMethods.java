package java8.functionalInterfaces.methodRefrence;

import java.util.function.Function;

public class BuiltInMethods {
    public static void main(String[] args) {
        Function<String,String> upperCase = String::toUpperCase;
        String result = upperCase.apply("java8");
        System.out.println(result);
    }
}
