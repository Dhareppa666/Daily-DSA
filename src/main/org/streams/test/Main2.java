package org.streams.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main2 {
    static Employee emp1 = new Employee(1, "A", "CSE", 1000.00);
    static Employee emp2 = new Employee(2, "B", "MBA", 2000.00);
    static Employee emp3 = new Employee(3, "C", "XYZ", 3000.00);
    static Employee emp4 = new Employee(4, "D", "ABC", 4000.00);
    static Employee emp5 = new Employee(4, "D", "ABC", 4000.00);

    public static void main(String[] args) {
        List<Employee> list = new LinkedList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        //list.add(emp5);
        // System.out.println(list);

        /*HashMap<String, Employee> map = new HashMap<>();
        list.stream().map(Employee->map.put(Employee.getName(), Employee)).collect(Collectors.toMap());
        System.out.println(collect);*/

        Function<Employee, String> keyMapper = (Employee e) -> {return e.getName();};

        Map<String, Employee> empp = list.stream()
                .collect(Collectors.toMap(Employee::getName, x -> x));
        System.out.println(empp);
        list.forEach(x -> System.out.println(x));
    }
}
