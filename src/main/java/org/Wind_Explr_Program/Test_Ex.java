package org.Wind_Explr_Program;

import org.util.AllInOneUtils;

public class Test_Ex {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("runtime.maxMemory(): "+runtime.maxMemory());
        System.out.println("runtime.availableProcessors(): "+runtime.availableProcessors());

//        int[] arr = new int[]{1,2,3,4,5};
//        System.arraycopy(arr, 0, new int[], 2, 2);
//
//        AllInOneUtils.printArr(arr);

        System.exit(2);
    }
}
