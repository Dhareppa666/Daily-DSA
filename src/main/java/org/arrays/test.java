package org.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class test {
    public static void main(String args[] ) throws Exception {

        int arr[]=new int[]{6,2,5,5,4,5,6,3,7,6};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        StringBuilder str=new StringBuilder("");
        while(test--!=0)
        {
            int count=0;
            String st=br.readLine();
            for(int i=0; i<st.length(); i++)
            {
                count+=arr[st.charAt(i)-'0'];
            }
            if(count%2==1)
            {
                str.append("7");
                count-=3;
                for(int i=0; i<count; i+=2)
                {
                    str.append("1");
                }
            }
            else
            {
                for(int i=0; i<count; i+=2)
                {
                    str.append("1");
                }
            }
            str.append("\n");
        }
        System.out.println(str);
    }

//    public static void main(String[] args) {
//        //duplicateZeros(new int[]{1, 2, 3, 0, 4, 5, 6, 7});
//        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0, 7, 8});
//        //                       1, 0, 0,
//        //duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
//    }


    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0 && i < n - 1) {
                arr2[i] = 0;
                arr2[i + 1] = 0;
                for (int j = n - 1; j >= (i + 2); j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            } else {
                arr2[i] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + ", ");
        }
    }
}