package org.streams.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsLearn {

    public static void main(String[] args) {
        //1.Mapping & Filter
        List<Integer> list = List.of(1,2,3,4,5,6,7);
        List<Integer> addSomeData = list.stream().map(x-> x+10).collect(Collectors.toList());
        System.out.println(addSomeData);

        List<Student> list2 = List.of(new Student(1, "Arun"), new Student(2, "Singh"), new Student(3, "Seema"));
        list2.stream().map(Student::getName).forEach(x->System.out.print(x+","));

        Map<String, Integer> map = new HashMap<>();
        map.put("Arun", 1);map.put("Justin", 2);map.put("Jess", 3);map.put("JB-Kaka", 4);

    }
}
