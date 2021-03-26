package org.MultiThreading.OddEvenExample;

public class Generator implements Runnable {

    private OddEvenEx oddEvenEx;

    private int result;

    public Generator(OddEvenEx oddEvenEx, int result) {
        super();
        this.oddEvenEx = oddEvenEx;
        this.result = result;
    }

    @Override
    public void run() {
        oddEvenEx.printNumbers(result);
    }
}
