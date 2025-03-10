package lambda_expression.basic;

//Functional Interface => Interface with only one abstract method
@FunctionalInterface
interface MathOperation{
    int operation(int a,int b);

    //Inside the Functional Interface many default and static methods can be written, but you have to
    //give the body to them.
    default void defaultMethod(int a,int b){

    }
    static void staticMethod(int a,int b){

    }
}

class Sum implements MathOperation{
    @Override
    public int operation(int a, int b) {
        return a+b;
    }
}

public class Main {

    public static void main(String[] args) {
        MathOperation subtract = (int a,int b) -> a-b;
        MathOperation multiply = (a,b) -> a*b;

        Sum sum = new Sum();
        System.out.println( sum.operation(60,40));

        System.out.println(subtract.operation(60,40));

        System.out.println(multiply.operation(6,4));

    }
}
