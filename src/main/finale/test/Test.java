package main.finale.test;

//ip:1,7,3,4,1,5,6,7,1,4
//op:
//1
//4
//7
//6
//5
//3
//null

import java.util.HashMap;

//pop method operation in constant time
public class Test {

    public static void main(String[] args) {
        int[] input = {10, 10, 10, 1, 7, 3, 4, 1, 10, 5, 6, 7, 1, 4};

        HashMap<Integer, Element> map = new HashMap<>();
        int index = 0;
        for (int x : input) {
            if (map.containsKey(x)) {
                Element ele = map.get(x);
                ele.value = ele.value + 1;
                map.put(x, ele);
            } else {
                map.put(x, new Element(x, 1, index));
            }
            index++;
        }

        System.out.println(map);

        map.values().stream()
                .sorted((a, b) -> a.value == b.value ? b.priority - a.priority : b.value - a.value)
                .forEach(System.out::println);

        System.out.println("end....");

    }

}

class Element {
    public int key;
    public int value;
    public int priority;

    public Element(int key, int value, int priority) {
        this.key = key;
        this.value = value;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return key + "";
    }

}
