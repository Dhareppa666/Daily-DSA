package org.MultiThreading;

import java.util.LinkedList;

public class Producer_Consumer_Test {

    public static void main(String[] args) throws InterruptedException {
        final PC pc = new PC();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    public static class PC {

        LinkedList<Integer> list = new LinkedList<>();
        int numberLimit = 100;
        boolean produced = false;

        private int max_even = Integer.MIN_VALUE;
        private int max_odd = Integer.MIN_VALUE;
        private int max_prime = -1;

        private int min_even = Integer.MAX_VALUE;
        private int min_odd = Integer.MAX_VALUE;
        private int min_prime = -1;

        public void finalize_custom() {
            System.out.println("Max Values respectively:");
            System.out.println("MAX-EVEN: " + max_even);
            System.out.println("MAX-ODD: " + max_odd);
            System.out.println("MAX-PRIME: " + max_prime);

            System.out.println("Min Values respectively:");
            System.out.println("MIN-EVEN: " + min_even);
            System.out.println("MIN-ODD: " + min_odd);
            System.out.println("MIN-PRIME: " + min_prime);
        }

        public void processElement(int data) {
            if (data % 2 == 0) {//even case
                if (data > max_even)
                    max_even = data;
                if (data < min_even)
                    min_even = data;
            } else { // odd case
                if (data > max_odd)
                    max_odd = data;
                if (data < min_odd)
                    min_odd = data;
            }
            derivePrimeValues(data);
        }

        private void derivePrimeValues(int data) {
            boolean isPrime = isGivenNoIsPrime(data);
            if (isPrime) {
                if (data > max_prime)
                    max_prime = data;
                if (data < min_prime)
                    min_prime = data;
            }
        }

        private boolean isGivenNoIsPrime(int data) {
            if (data <= 2)
                return true;
            for (int i = 2; i <= data / 2; i++) {
                if (data % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public synchronized void produce() throws InterruptedException {
            int counter = 5;
            while (true) {
                if (counter <= 15) {
                    if (produced) {
                        wait();
                    } else {
                        int value = ((int) System.currentTimeMillis()) % numberLimit;
                        list.add(value);
                        processElement(value);
                        System.out.println("Producer produced-" + value);
                        produced = true;
                        notify();
                        Thread.sleep(1000);
                    }
                } else {
                    finalize_custom();
                    break;
                }
                counter++;
            }
        }

        public synchronized void consume() throws InterruptedException {
            int counter = 5;
            while (true) {
                if (counter <= 15) {
                    if (!produced) {
                        wait();
                    } else {
                        int val = list.removeFirst();
                        System.out.println("Consumer consumed-" + val);
                        produced = false;
                        notify();
                        Thread.sleep(1000);
                    }
                } else {
                    break;
                }
                counter++;
            }
        }
    }
}
