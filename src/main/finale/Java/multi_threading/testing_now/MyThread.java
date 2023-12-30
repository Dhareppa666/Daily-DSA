package main.finale.Java.multi_threading.testing_now;

public class MyThread extends Thread{

    String name;

    main.finale.Java.multi_threading.testing_now.printer printer;

    int counter;

    public MyThread(String name, main.finale.Java.multi_threading.testing_now.printer printer){
        super();
        this.name = name;
        this.printer = printer;
    }

    @Override
    public void run() {
        synchronized (this) {
            for(int i=1; i<=10; i++){
                printer.display(name);
            }
        }
    }
}
