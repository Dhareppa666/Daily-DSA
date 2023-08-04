package org.REAL_TIME_COMP_QUES.Radisys;

class Test implements Runnable {
    @Override
    public void run() {
        int index = 0;
        while (index < 5) {
            System.out.println(index + "-" + Thread.currentThread().getName());
            index++;
        }
    }
}

public class Radisys_Round02_02 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main-Started.");
        Test t = new Test();
        Thread thread1 = new Thread(t, "My-Thread1");
        Thread thread2 = new Thread(t, "My-Thread2");
        thread1.start();
//        thread2.start();
        System.out.println("Main-Ended.");
//        Thread.sleep(1_000);
        System.exit(1);//
    }
}
