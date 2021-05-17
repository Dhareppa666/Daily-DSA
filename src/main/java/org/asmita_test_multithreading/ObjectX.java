package org.asmita_test_multithreading;

public class ObjectX {

    public String name;

    public synchronized void wish(String name) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + name);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }
}
