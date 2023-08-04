package org.searching;
/*

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
*/

public class Linear_Search {

    //private static final Logger Log = LogManager.getLogger(Linear_Search.class);

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = searchElement(arr, 40);
        if(index != -1){
            System.out.println("Key present at index: "+ index);
        } else {
            System.out.println("Key not found in the given array.");
        }
    }

    private static int searchElement(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}
