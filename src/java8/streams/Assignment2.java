package java8.streams;


//👉 💡 Challenge:
//You have a list of Employee objects like:
//
//List<Employee> employees = Arrays.asList(
//        new Employee("John", 10000),
//        new Employee("Mike", 15000),
//        new Employee("Anna", 20000)
//);
//👉 ✅ Task:
//
//Use reduce() to find the total salary of all employees.
//Use reduce() to find the highest-paid employee.


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employee{
    String name;
    Integer sal;

    public Employee(String name,Integer sal){
        this.name = name;
        this.sal=sal;
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 10000),
                new Employee("Mike", 15000),
                new Employee("Anna", 20000));

        List<Employee> employee = Arrays.asList();
        //Use reduce() to find the total salary of all employees.
        System.out.println("Total sal: "+ employees.stream().map(emp -> emp.sal).reduce(0,Integer::sum));

        //Use reduce() to find the highest-paid employee.
        Optional<Employee> max = employee.stream().reduce((emp1, emp2) -> emp1.sal > emp2.sal ? emp1 : emp2);
        max.ifPresent(emp -> System.out.println("Highest Paid: " + emp.name + " with salary " + emp.sal));
    }
}
