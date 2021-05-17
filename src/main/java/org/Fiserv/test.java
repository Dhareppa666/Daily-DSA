package org.Fiserv;

import java.util.concurrent.ThreadLocalRandom;

public class test {
    public static void main(String[] args) {

        int i=0;
        while (i != 100) {
            Long randomNum = ThreadLocalRandom.current().nextLong(200, 400 + 1);
            System.out.println(randomNum);
            i++;
        }

    }
}
