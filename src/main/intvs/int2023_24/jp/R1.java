package main.intvs.int2023_24.jp;

public class R1 {
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//import java.util.*;
//
//class Main {
//    public static void main(String[] args) throws Exception{
//        System.out.println("Try programiz.pro");
//        // 3 threads.. seq of 1 to 10..
//        // t1, 1 , 4
//        // t2, 2 , 5
//        // t3, 3 , 6
//
//        Thread t1 = new Thread(()->{
//            try{
//                System.out.println("From Thread t1");
//            } catch (InterruptedException e) {
//
//            }
//        });
//        Thread t2 = new Thread(()->{
//            try{
//                System.out.println("From Thread t2");
//            } catch(InterruptedException e) {
//
//            }
//        });
//        Thread t3 = new Thread(()->{
//            try{
//                System.out.println("From Thread t3");
//            } catch(InterruptedException e) {
//
//            }
//        });
//
//        try {
//            Client client = new Client(List.of(t1, t2, t3));
//
//            t1.start();
//            t2.start();
//            t3.start();
//
//            client.produce();
//
//
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch(InterruptedException e) {
//            //
//        }
//
//
//        System.out.println("End");
//    }
//}
//
//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        //
//    }
//}
//
//class Client {
//    private static int max = 10;
//    private volatile int currCount = 1;
//
//    private List<Thread> threadList;
//
//    Queue<Thread> queue;//...
//
//    public Client(List<Thread> threadsList) {
//        this.threadList = threadsList;
//        this.queue = new LinkedList<>();
//        for(Thread x: threadsList) {
//            queue.offer(x);
//        }
//    }
//
//    public void produce() throws Exception{
//
//        while(true) {
//
//            try {
//                Thread t = queue.poll();
//                System.out.println("Thread name: " + t.getName() + " with count" + currCount);
//                currCount += 1;
//
//                queue.offer(t);
//                t.wait();
//                t.notifyAll(); //
//
//                if(currCount > max) {
//                    break;
//                }
//            } catch(Exception e) {
//                //
//            }
//
//
//        }
//
//    }
//
//}
//
//
//
//// kth element from LL from the end..
//public ListNode getKthElement(ListNode root, int k) {
//    if(root == null) {
//        return root;
//    }
//
//    ListNode curr = root;
//    for(int i = 1; i <= k; i++) {
//        curr = curr.next;
//    }
//
//    ListNode pointer = root;
//
//    while(curr != null) {
//        curr = curr.next;
//        pointer = pointer.next;
//    }
//
//    return pointer;
//}
//
//// list, set and map
//
//











