package org.Wind_Explr_Program;

public class Stack_Ex {

    public static int[] arr;

    public static int top=-1;

    public Stack_Ex(int size){
        arr = new int[size];
    }

    public static void main(String[] args) {
        Stack_Ex stack_ex = new Stack_Ex(10);

        stack_ex.push(1);
        stack_ex.push(2);
        stack_ex.push(3);
        stack_ex.push(4);
        stack_ex.push(5);
        stack_ex.push(6);
        stack_ex.push(7);
        stack_ex.push(8);
        stack_ex.push(9);
        stack_ex.push(10);
        System.out.println("The size is: "+(top+1));

        System.out.println(stack_ex.pop());
        System.out.println(stack_ex.pop());
        System.out.println(stack_ex.pop());
        System.out.println(stack_ex.pop());
        System.out.println(stack_ex.pop());
        System.out.println(stack_ex.pop());
        System.out.println(stack_ex.pop());
        System.out.println(stack_ex.pop());
        System.out.println(stack_ex.pop());
        System.out.println(stack_ex.pop());

        System.out.println("The size is: "+(top+1));

        stack_ex.push(50);
        stack_ex.push(100);
        System.out.println("The size is: "+(top+1));

        stack_ex.peek();

//        System.out.println("The size is: "+(top+1));
    }

    private int peek() {
        if(top <0){
            System.out.println("STack is empty");
            return -1;
        }
        return arr[top];
    }

    private int pop() {
        if(top<0){
            System.out.println("Stack is Empty");
            return -1;
        }
//        int temp = arr[top] ;
//        arr[top--] = 0;
        return arr[top--];
    }

    private void push(int data) {
        if(top>=arr.length){
            System.out.println("Stack is Full.");
            return;
        }
        //top++;
        arr[++top] = data;
    }
}
