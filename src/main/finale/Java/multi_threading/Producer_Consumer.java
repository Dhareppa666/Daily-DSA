package main.finale.Java.multi_threading;

import java.util.LinkedList;

public class Producer_Consumer {

    public static void main(String[] args) {
        final PC pc = new PC();

        Thread t1 = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException ex) {

            }
        }, "Thread-01");

        Thread t2 = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException ex) {

            }
        }, "Thread-02");

        t1.start();
        t2.start();

    }

    static class PC {

        public volatile LinkedList<Integer> list;

        public int num;

        public boolean isProduce;

        public PC() {
            this.list = new LinkedList<>();
            this.isProduce = true;
            this.num = 1;
        }

        public void produce() throws InterruptedException {
            synchronized (this) {
                while (true) {
                    if (!this.isProduce) {
                        wait();
                    } else {
                        System.out.println("Produced " + num);
                        this.list.add(num);
                        this.num++;
                        this.isProduce = false;
                        notify();
                        Thread.sleep(1000);
                    }
                }

            }
        }

        public void consume() throws InterruptedException {
            synchronized (this) {
                while (true) {
                    if (this.isProduce) {
                        wait();
                    } else {
                        Integer ele = this.list.removeFirst();
                        System.out.println("Consumed " + ele);
                        this.isProduce = true;
                        notify();
                        Thread.sleep(1000);
                    }
                }

            }
        }
    }
}
