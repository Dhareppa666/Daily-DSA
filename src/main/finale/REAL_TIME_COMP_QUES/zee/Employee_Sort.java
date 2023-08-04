package org.REAL_TIME_COMP_QUES.zee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee_Sort {

    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee("Arun", "HR"));
        list1.add(new Employee("Sandeep", "XYZ"));
        list1.add(new Employee("Tarun", "Apx"));

        list1.add(new Employee("ABC", "Apx"));

        Collections.sort(list1, new Comparator_Class());

        System.out.println("The Emp list is : " + list1);

        System.out.println("B".compareTo("A"));
        System.out.println("B".compareTo("B"));
        System.out.println("B".compareTo("C"));
    }
}
