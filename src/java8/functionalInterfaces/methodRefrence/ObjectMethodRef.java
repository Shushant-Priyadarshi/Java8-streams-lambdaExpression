package java8.functionalInterfaces.methodRefrence;

import java.util.function.Consumer;

public class ObjectMethodRef {

    private void printMessage(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {

        //old way
        ObjectMethodRef obj = new ObjectMethodRef();
        obj.printMessage("Hello world");

        // obj reference
        ObjectMethodRef obj2 = new ObjectMethodRef();
        Consumer<String> c = obj2::printMessage;
        c.accept("Hello world 2");
    }
}
