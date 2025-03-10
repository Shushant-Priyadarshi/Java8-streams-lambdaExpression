package java8.functionalInterfaces.basic.supplier;

import java.util.function.Supplier;

public class Learning {
    public static void main(String[] args) {
        Supplier<String> returnName = () -> "Shushant";
        System.out.println(returnName.get());

    }
}
