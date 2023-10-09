package org.In_Walmart.nextLeap.arrays.medium;

import java.util.Arrays;

//1013. Partition Array Into Three Parts With Equal Sum
public class Partition_Array_Into_Three_Parts_With_Equal_Sum {

    public static void main(String[] args) {
        boolean isPartValid = isValidParts(new int[]{0,2,1,-6,6,-7,9,1,2,0,1});
        System.out.println(isPartValid);
    }

    public static boolean isValidParts(int[] arr) {
        int sum = Arrays.stream(arr).sum(), avarage = sum / 3, partSum = 0, count = 0;
        for(int x: arr) {
            partSum += x;
            if(partSum == avarage) {
                count++;
                partSum = 0;
            }
        }
        return count >=3 && sum % 3 ==0;
    }

    //TODO: check this once.
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = Arrays.stream(A).sum(), average = sum / 3;
        if (sum % 3 != 0) {
            return false;
        }
        int l = 0, r = A.length - 1;
        int leftSum = A[l++], rightSum = A[r--];
        do {
            if (leftSum != average)
                leftSum += A[l++];
            if (l < r && rightSum != average)
                rightSum += A[r--];
            if (l <= r && leftSum == average && rightSum == average)
                return true;
        } while (l < r);
        return false;
    }
}
