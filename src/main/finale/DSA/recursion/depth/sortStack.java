package main.finale.DSA.recursion.depth;

import java.util.Stack;

public class sortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(7);
        Stack<Integer> tempStack = sortStack(stack);
        System.out.println(tempStack);
    }

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        if(stack.size() <= 1) {
            return stack;
        }
        int temp = stack.pop();
        Stack<Integer> tempStack = sortStack(stack);
        if(stack.peek() < temp) {
            int peek = tempStack.pop();
            tempStack.push(temp);
            tempStack.push(peek);
        } else {
            tempStack.push(temp);
        }
        return tempStack;
    }
}
