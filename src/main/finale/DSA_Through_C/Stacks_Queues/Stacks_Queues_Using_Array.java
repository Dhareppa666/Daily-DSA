package main.finale.DSA_Through_C.Stacks_Queues;

public class Stacks_Queues_Using_Array {

    private static int MAX = 10;

    private static int[] arr = new int[MAX];

    private static int top = -1;

    public static void main(String[] args) {
        displayStack();
        push(10);
        push(20);
        push(30);
        displayStack();
        push(40);
        push(50);
        push(60);
        push(70);
        push(80);
        push(90);
        push(100);
        push(110);
        push(120);
        displayStack();
        pop();
        displayStack();
        pop();
        displayStack();
        push(200);
        displayStack();
    }

    private static void pop() {
        if(isStackEmpty()){
            System.out.println("The Stack is Empty. Not able to pop any elements");
            return;
        }
        System.out.println("The element "+arr[top] + " has been popped..");
        arr[top] = 0;
        top--;
    }

    private static boolean isStackEmpty() {
        return top==-1;

    }

    private static void displayStack() {
        if (top == -1) {
            System.out.println("The Stack is empty");
        } else {
            System.out.print("The Stack Elements are =>");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " : ");
            }
            System.out.println();
        }
    }

    private static void push(int i) {
        if (isStackOverflow()) {
            System.out.println("The Stack is overflow... Element "+ i +" didn't inserted.");
            return;
        }
        System.out.println("The element "+ i + " has been Pushed..");
        top++;
        arr[top] = i;
    }

    private static boolean isStackOverflow() {
        if (top == MAX - 1) {
            return true;
        }
        return false;
    }
}
