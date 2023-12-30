package main.intvs.int2021_22.epam;

import java.util.ArrayList;
import java.util.List;

public class SubAray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for (int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                List<Integer> temp = new ArrayList<>();
                for (int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    temp.add(arr[k]);
                }
                list.add(temp);
                System.out.println();
            }
        }

        System.out.println(list);
    }
}
