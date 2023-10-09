package main.finale.DSA_Through_C.Stacks_Queues;

public class Queue22 {

    private static int front, rear, capacity;

    private static int queue[];

    Queue22(int c)
    {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    public static void main(String[] args) {
        new Queue22(10);
        enQueue(10);
        enQueue(20);
        enQueue(30);
        enQueue(40);
        display();
        deQueue();
        display();
        enQueue(50);
        display();
    }

    private static void display() {
        if(front == rear) {
            System.out.println("The Queue is Empty.");
            return;
        }
        for (int i=front; i<rear; i++) {
            System.out.printf(" %d <--", queue[i]);
        }
        System.out.println();
    }

    private static void deQueue() {
        if(front == rear){
            System.out.println("The Queue is Empty");
            return;
        } else {
            for (int i=0; i<rear-1; i++){
                queue[i] = queue[i+1];
            }
            if (rear < capacity) // store 0 at rear indicating there's no element
                queue[rear] = 0;

            rear--; // decrement rear
        }
    }

    private static void enQueue(int data) {
        if(rear == capacity){
            System.out.println("The Queue is Full");
            return;
        }
        queue[rear] = data;
        rear++;
    }
}
