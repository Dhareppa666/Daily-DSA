package main.finale.Java.Collections_In_Java.List;

import java.util.Stack;

//LIFO : Last in First Out
//Please note that the Stack class in Java is a legacy class and
// inherits from Vector in Java.
// It is a thread-safe class and hence involves overhead when we do not need thread safety.
// It is recommended to use ARRAYDEQUEUE for stack.
// implementation as it is more efficient in a single-threaded environment.

//<tt>push</tt>  <tt>pop</tt>  <tt>peek</tt>  <tt>empty</tt>  <tt>search</tt>(this will give index)
public class Stack_Example {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }

    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack) {
        System.out.println("Push Operation:");
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }
}
