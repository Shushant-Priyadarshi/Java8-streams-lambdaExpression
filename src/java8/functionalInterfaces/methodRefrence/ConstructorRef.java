package java8.functionalInterfaces.methodRefrence;


import java.util.function.Function;

class  Student{
    String name;

    public Student(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "name: "+name;
    }
}

public class ConstructorRef {
    public static void main(String[] args) {

        //older way
        Student s1 = new Student("Shushant");
        System.out.println(s1);

        //bit better
        Function<String,Student> giveName2 = name -> new Student(name);
        Student mj = giveName2.apply("MJ");
        System.out.println(mj);

        //newer way
        Function<String,Student> giveName = Student::new;
        Student s2 = giveName.apply("Prisha");
        System.out.println(s2);

    }
}
