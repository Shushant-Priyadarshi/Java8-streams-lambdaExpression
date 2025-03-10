package lambda_expression.predicate;


public class BeforeJava8 {

    private static boolean isEven(int x){
        return x % 2 ==0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(43));
    }
}
