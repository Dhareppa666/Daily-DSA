package org;


import java.util.*;
import java.lang.*;

public class Solution1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 2, 1, 10, 3, 9, 5, 1, 1, 7, 6);
        sortOddEven(list);
        System.out.println(list);
    }

    public static ArrayList<Integer> sortOddEven(List<Integer> array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        Iterator itr = array.listIterator();
        while (itr.hasNext()) {
            int x = (int) itr.next();
            if (x % 2 != 0) {
                result.add(x);
            } else {
                evenList.add(x);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            int x = result.get(i);
            for (int j = i + 1; j < result.size(); j++) {
                if (x > result.get(j)) {
                    //swap indexes.
                    int temp = x;
                    result.set(x, result.get(j));
                    result.set(j, temp);
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            int x = result.get(i);
            for (int j = i + 1; j < result.size(); j++) {
                if (x < result.get(j)) {
                    //swap indexes.
                    int temp = x;
                    result.set(x, result.get(j));
                    result.set(j, temp);
                }
            }
        }
        itr = evenList.iterator();
        while (itr.hasNext()) {
            result.add((int) itr.next());
        }
        return result;
    }

}

//  o/p: 1,1,1,3,5,7,9  ,10,6,4,2



