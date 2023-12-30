package main.finale.DSA.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateArrays {
    public static void main(String[] args) {
        String[] arr = {"ABC", "DEF", "XYZ", "VERIFONE", "VERIFONE", "ABC", "XYZ"};
        System.out.println("********Brute Force Mathod*******");
        for (int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

        System.out.println("********Hash Set*******");
        Set<String> set = new HashSet<>();
        for (String e : arr){
            if(!set.add(e)){
                System.out.println(e);
            }
        }

        System.out.println("********Hash Map*******");
        Map<String, Integer> hashmap = new HashMap<>();
        for(String e : arr){
            Integer count = hashmap.get(e);
            if(count == null){
                hashmap.put(e, 1);
            } else {
                hashmap.put(e, ++count);
            }
        }
        hashmap.entrySet().forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
        //Set<Map.Entry<String, Integer>> entries = hashmap.entrySet();
        for (Map.Entry<String, Integer> e: hashmap.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey());
            }
        }

        System.out.println("********Streams*******");
        Set<String> streamSet = new HashSet<>();

        Set<String> strOutPut = Arrays.asList(arr).stream()
                .filter( x -> !streamSet.add(x))
                .collect(Collectors.toSet());
        System.out.println(strOutPut);
    }
}
