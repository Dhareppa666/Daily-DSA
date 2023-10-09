package main.finale.asmita_test_multithreading;

public class MyThread extends Thread {

    ObjectX objectX;
    String name;

    MyThread(ObjectX objectX, String name) {
        this.objectX = objectX;
        this.name = name;
    }

    @Override
    public void run() {
        objectX.wish(name);
    }
}
