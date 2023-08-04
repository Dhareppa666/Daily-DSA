package org.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDatabase {

    public static List<Employee> getEmployee() {
        List<Employee> emp = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            emp.add(new Employee(i, "employee" + i, "A", Double.valueOf(new Random().nextInt(1000 * 100))));
        }
        return emp;
    }
}
