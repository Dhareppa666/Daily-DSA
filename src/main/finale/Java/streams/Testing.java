package main.finale.Java.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Testing {

    public static void main(String[] args) {
        String[] input = {"ACD", "DEF", "XYZ"};
        Map<String, Integer> collect = Arrays.stream(input).collect(Collectors.toMap(x-> x, y -> y.length()));
        System.out.println(collect);
    }
}
