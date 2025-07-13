package main.intvs.int2023_24.microsoft.dec;

import java.util.*;

public class Round_01 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //List<Integer> list = {1,2,3,4,5,6,7,8,9,10};
        //int k = 0.5;//
        // o/p: {1,2,3,4,5}, {1,2,3,4,6}, {1,2,3,4,7}

        // 2^n

        Random rand = new Random();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        double k = 0.8d;
        int percentCount = (int) ( k * 10.0d);

        List<Integer> res = new ArrayList<>();
        for(int index = 0; index<list.size()-percentCount; index++) {
            int ele = rand.nextInt(list.size());
            res.add(list.get(ele));
        }

        System.out.println(res);
        // getPermutations(list, new ArrayList<>(),percentCount, 0);

    }

//    public static List<Integer> get

    public static void getPermutations(List<Integer> nums, List<Integer> tempList, int percentCount, int idx) {
        if(tempList.size() == percentCount) {
            // System.out.println(tempList);
            return;
        } else if(tempList.size() > percentCount) {
            return;
        }
        for(int index = idx; index<nums.size(); index++ ) {
            tempList.add(nums.get(index));
            getPermutations(nums, tempList, percentCount, idx);
            tempList.remove(tempList.size()-1);
        }
    }
}
