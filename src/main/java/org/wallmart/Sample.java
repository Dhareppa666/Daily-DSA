package org.wallmart;

//Given an array A of N elements.
// Find the majority element in the array.
// A majority element in an array A of size N is an element that appears
// more than N/2 times in the array.
//Example 1:
//
//Input:
//N = 3
//A[] = {1,2,3}
//Output:
//-1
//Explanation:
//Since, each element in
//{1,2,3} appears only once so there
//is no majority element.
//Example 2:
//
//Input:
//N = 5
//A[] = {3,1,3,3,2}
//Output:
//3
//Explanation:
//Since, 3 is present more
//than N/2 times, so it is
//the majority element.
public class Sample {

    public static void main(String[] args) {
        int[] arr= {1,2,3};
        int n = arr.length;
        System.out.println(getMajorityElement(arr, n));
    }

    private static int getMajorityElement(int[] arr, int n) {
        int me = arr[0];
        int count = 1;
        for (int i=1; i<n; i++){
            if(count == 0){
                me = arr[i];
                count++;
            }
            if (me == arr[i]){
                count++;
            } else {
                count--;
            }
        }
        int me_occurance = 0;
        for (int i=0; i<n; i++){
            if(arr[i] == me)
                me_occurance++;
        }
        if(me_occurance < (n/2)+1){//3/2-> 1+1
            return -1;
        }
        return me;
    }
}
