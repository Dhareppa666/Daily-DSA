package main.finale.leetcode.Daily;

import java.util.Stack;

public class Validate_Stack_Sequences {

    public static void main(String[] args) {
//        boolean res = validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2});
        boolean res = validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,2});

        System.out.println(res);
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int left =0, right =0 ;
        stack.push(pushed[left++]);
        while(!stack.isEmpty() && right-1 < popped.length){
            int top = stack.peek();
            if(top == popped[right]){
                stack.pop();
                right++;
            }
            if(left >= pushed.length){
                continue;
            }
            stack.push(pushed[left++]);
        }
        return stack.size() == 0;
    }
}
