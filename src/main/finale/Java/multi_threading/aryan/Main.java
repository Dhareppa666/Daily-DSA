package main.finale.Java.multi_threading.aryan;

public class Main {

    public static void main(String[] args) {
        try{
            MyThread myThread = new MyThread(3);
            Thread t1 = new Thread(myThread, "1");
            Thread t2 = new Thread(myThread, "2");
            Thread t3 = new Thread(myThread, "3");
            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {

        }

        System.out.println("END");
    }
}

class MyThread extends Thread{

    public volatile int count = 1;

    public int threadCount;

    public MyThread(int numOfThreads) {
        this.threadCount = numOfThreads;
    }

    @Override
    public void run() {
        while (count <= 15) {
            synchronized (this) {
                try{
                    int currThreadName = count % threadCount == 0 ? threadCount : count % threadCount;
                    if(Thread.currentThread().getName().equals("" + currThreadName)) {
                        System.out.println(Thread.currentThread().getName() + " : " + count);
                        count++;
                    }
                    Thread.sleep(500);
                    notifyAll();

                    if(count <= 15) {
                        wait();
                    }
                } catch (Exception e) {
                    System.out.println("Error occurred by: " + Thread.currentThread().getName() );
                }
            }
        }
        System.out.println("DONE");
    }
}
