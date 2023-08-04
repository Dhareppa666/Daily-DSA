package org.streams;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        long start = 0;
        long end = 0;
/*

        //1. Sequential Streaming
        start = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(System.out::print);
        end = System.currentTimeMillis();
        System.out.println("Plain steam time taken : " + (end - start));

        System.out.println("=========================");

        long start2 = 0;
        long end2 = 0;
        //2. Parallel Streaming
        start2 = System.currentTimeMillis();
        IntStream.range(1, 100).parallel().forEach(System.out::print);
        end2 = System.currentTimeMillis();
        System.out.println("Parallel steam time taken : " + (end2 - start2));
*/

        long start2 = 0;
        long end2 = 0;
//        start2 = System.currentTimeMillis();
//        IntStream.range(1, 10).forEach(x -> {
//                    System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
//                });
//        end2 = System.currentTimeMillis();
//        System.out.println("Plain: "+(end2-start2));
//
//        System.out.println("=================================");
//        start2 = System.currentTimeMillis();
//        IntStream.range(1, 10).parallel().forEach(x -> {
//            System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
//        });
//        end2 = System.currentTimeMillis();
//        System.out.println("Parallel: "+(end2-start2));

        //System.out.println("**************************************");
        List<Employee> employee = EmployeeDatabase.getEmployee();

        //1. normal flow (Seq flow)
        start = System.currentTimeMillis();
        double salary1 = employee.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
        System.out.println("Salary 1 : "+salary1);
        end = System.currentTimeMillis();
        System.out.println("Plain: "+(end-start));

        System.out.println("=================================");
        start2 = System.currentTimeMillis();
        double salary2 = employee.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
        System.out.println("Salary 1 : "+salary2);
        end2 = System.currentTimeMillis();
        System.out.println("Parallel: "+(end2-start2));
    }

}
