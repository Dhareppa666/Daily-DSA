package main.finale.REAL_TIME_COMP_QUES.Papal;

import java.util.ArrayList;
import java.util.Arrays;

public class PayPal {

    public static void main(String[] args) {
        int res = mostBalloons(6, new int[][]{{1,1}, {2,2}, {3,4}, {4,5}, {5,6}, {9,10}});
        System.out.println(res);
    }

    public static int mostBalloons(int N, int arr[][]) {
        // Code here
        int[] arr2 = new int[N];

        for(int i=0; i<N; i++){//3
            arr2[i] = Math.abs(arr[i][0]-arr[i][1]);
        }
        Arrays.sort(arr2);
        int curr =1;
        int max = 1;
        int res = arr2[0];
        for(int j=1; j<N; j++){//0,1
            if(arr2[j-1] == arr2[j])
                curr++;
            else {
                if(curr>max){
                    max = curr;
                    res = arr2[j-1];
                }
                curr=1;
            }
        }
        if(curr>max){
            max = curr;
            res = arr2[N-1];
        }
//        System.out.println(max);
        return max;
    }
}
