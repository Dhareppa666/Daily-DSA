package main.intvs.samsung;

public class Round_02 {
}

///*
//
//Given an array of integers temperatures represents the daily temperatures,
//return an array answer such that answer[i] is the number of days you have to wait after the ith day to
//get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
//
//
//Example 1:
//
//Input: temperatures = [73,74,75,71,69,72,76,73, 74]
//Output:               [1, 1, 4, 2, 1, 1, 0, 1, 0]
//Example 2:
//
//Input: temperatures = [30,40,50,60]
//Output: [1,1,1,0]
//
//Example 3:
//
//Input: temperatures = [30,60,90]
//Output: [1,1,0]

//class Solution {
//
//    public int[] getTempDiff(int[] input) {
//        if(input.length <=1) {
//            return new int[]{0};
//        }
//        int[] result = new int[input.length];
//        int resIndex = 0;
//        for(int index = 0; index<input.length-1; index++) {//75
//            int tempCount = 1;//2,3,,4
//            boolean isGreaterEleExist = false;
//            for(int index2 = i+1; index2< input.length; index2++) {
//                if(input[index2] > input[index]) {
//                    isGreaterEleExist = true;
//                    break;
//                }
//                tempCount++;
//            }
//            if(isGreaterEleExist) {
//                res[resIndex++] = tempCount;
//            } else {
//                resIndex++;
//            }
//        }
//        return res;
//    }
//
//}
//
//===================

//Q2: Design Payment Gateway system which can talk to multiple clients like Gpay, Phonepe and all.
//
//
//models:
//Transaction (CustInfo, MerchantInfo, AdressOfCust/Merch)
//
//Controllers:
//TransactionController (/api/v1/handleTransaction)
//
//Services:
//TransactionHandler (with help of util classes...)
//
//
//
//<!--
//Inreface
//Payment -->
