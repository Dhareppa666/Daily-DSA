package main.finale.Java.multi_threading;

public class Odd_Even_Example {

    public static void main(String[] args) throws InterruptedException {
        OddEvenHandler obj = new OddEvenHandler();

        Thread t1 = new Thread(() -> {
            try {
                obj.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread-1");
        t1.start();

        Thread t2 = new Thread(() -> {
            try {
                obj.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread-2");
        t2.start();

        t1.join();
        t2.join();
    }

    static class OddEvenHandler {
        boolean isEven;

        int num;

        public OddEvenHandler() {
            this.isEven = true;
            this.num = 0;
        }

        public void printEven() throws InterruptedException {
            synchronized (this) {
                while (true) {
                    if (isEven) {
                        System.out.println(Thread.currentThread().getName() + ": " + num++);
                        isEven = false;
                        notify();
                        Thread.sleep(1000);
                    } else {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }

        public void printOdd() throws InterruptedException {
            synchronized (this) {
                while (true) {
                    if (isEven) {
                        wait();
                    } else {
                        System.out.println(Thread.currentThread().getName() + ": " + num++);
                        isEven = true;
                        notify();
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
