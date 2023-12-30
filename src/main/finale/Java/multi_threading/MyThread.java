package main.finale.Java.multi_threading;

import main.finale.aa.Java.multi_threading.ObjectX;

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
