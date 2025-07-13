package main.finale.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class Testing {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100);
        System.out.println(x);

        Random random2 = new Random();
        int x2 = random2.nextInt(100);
        System.out.println(x2);

        Deque<String> deque = new ArrayDeque<>();
        deque.add("s1");
        deque.add("s4");
        deque.add("s2");
        deque.add("s5");
        deque.add("s3");

        System.out.println(deque);

        deque.pollLast();

        System.out.println(deque);
    }
}
