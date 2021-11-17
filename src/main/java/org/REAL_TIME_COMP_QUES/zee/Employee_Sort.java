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

        //list.sort();
// 		List<Employee> sortedEmpList = list.stream()
// 		                                    .sorted(Comparator::compareTo)
// 		                                    .collect(Collector.toList());


        Collections.sort(list1);

        System.out.println("The Emp list is : " + list1);
    }
}
