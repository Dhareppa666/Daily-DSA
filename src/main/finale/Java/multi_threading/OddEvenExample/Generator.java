package main.finale.Java.multi_threading.OddEvenExample;

import main.finale.aa.Java.multi_threading.OddEvenExample.OddEvenEx;

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
