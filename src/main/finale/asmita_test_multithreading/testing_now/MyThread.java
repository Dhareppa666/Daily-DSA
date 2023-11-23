package main.finale.asmita_test_multithreading.testing_now;

public class MyThread extends Thread{

    String name;

    printer printer;

    int counter;

    public MyThread(String name, printer printer){
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
