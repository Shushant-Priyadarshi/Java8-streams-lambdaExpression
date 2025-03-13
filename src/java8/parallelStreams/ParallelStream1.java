package java8.parallelStreams;

import java.util.List;
import java.util.stream.Stream;

//A parallel stream is used to process data faster by dividing the task into multiple threads (multi-threading).
//
//👉 Why Parallel Streams?
//    Faster execution for large datasets
//    Utilizes multiple CPU cores
//    Uses the Fork/Join framework for parallelism

public class ParallelStream1 {

    public static void main(String[] args) {

        //streams(200ms)
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Integer> factList = list.stream().map(ParallelStream1::factorial).toList();
        long endTime =  System.currentTimeMillis();
        System.out.println("Time Taken in sequenstial stream: "+(endTime-startTime)+" ms");

        //paralle streams(50ms)
        startTime = System.currentTimeMillis();
        List<Integer> list2 = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Integer> factList2 = list.parallelStream().map(ParallelStream1::factorial).toList();
        endTime =  System.currentTimeMillis();
        System.out.println("Time Taken in sequenstial stream: "+(endTime-startTime)+" ms");


    }

    private static int factorial(int n){
        int fact =1;
        for(int i =2 ; i <= n ; i++){
            fact *= i ;
        }
        return fact;
    }
}
