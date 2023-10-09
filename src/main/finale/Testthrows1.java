package main.finale;

import java.io.IOException;

class Testthrows1 {

    void m() throws IOException {
        throw new IOException("device error");//checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() throws IOException  {
//        try {
            n();
//        } catch (Exception e) {
//            System.out.println("exception handled");
//        }
    }

    public static void main(String args[]){
        Testthrows1 obj = new Testthrows1();
        try {
            obj.p();
        } catch (IOException e) {
            System.out.println("I catch this exception..");
        }
        System.out.println("normal flow...");
    }
}