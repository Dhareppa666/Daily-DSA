package main.finale.asmita_test_multithreading.testing_now;

public class printer {

    public void display(String name) {
        System.out.println(Thread.currentThread().getName()+" : "+name);
//        try{
//            Thread.sleep(50);
//        } catch (InterruptedException e){
//
//        }
    }
}
