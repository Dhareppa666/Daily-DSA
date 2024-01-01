package main.intvs.int2021_22.int2021_22.walmart;

import java.util.Stack;

public class Queue_Using_Stack {

    private static Stack<Integer> stack1 = new Stack<>();

    private static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        Queue_Using_Stack queue = new Queue_Using_Stack();
        queue.enQueue(60);
        queue.enQueue(20);
        queue.enQueue(40);
        System.out.println("The Element at Head is: " + queue.deQueue());
        System.out.println("The Element at Head is: " + queue.deQueue());
        System.out.println("The Element at Head is: " + queue.deQueue());
        System.out.println("The Element at Head is: " + queue.deQueue());
    }

    public void enQueue(int value) {
        stack1.push(value);//10,20,30,40,100
    }

    public int deQueue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1;
            }
            while (stack1.size() != 0)
                stack2.push(stack1.pop());//40,30,20,10
        }
        return stack2.pop();//o/p:10//40,30,20
    }
}
