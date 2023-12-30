package main.finale.Java.streams.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

    static Employee emp1 = new Employee(1, "A", "CSE", 1000.00);
    static Employee emp2 = new Employee(2, "B", "MBA", 2000.00);
    static Employee emp3 = new Employee(3, "C", "XYZ", 3000.00);
    static Employee emp4 = new Employee(4, "D", "ABC", 4000.00);
    static Employee emp5 = new Employee(4, "D", "ABC", 4000.00);

    public static void main(String[] args) {
        list();
        set();
    }

    private static void list() {
        List<Employee> list = new LinkedList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.println(list);
    }

    private static void set() {
        Set<Employee> set = new HashSet<>();
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        set.add(emp4);
        set.add(emp5);
        System.out.println(set);
    }
}
