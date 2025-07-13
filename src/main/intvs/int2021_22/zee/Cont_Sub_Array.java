package main.intvs.int2021_22.zee;

public class Cont_Sub_Array {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr ={-5, 7, 3, -2, 0, -1, 6};//13
        int last_max = 0, max_so_far = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            last_max = last_max + arr[i];
            if (last_max> max_so_far)
                max_so_far = last_max;
            if(last_max<0)
                last_max = 0;

        }
        System.out.println("The cont sum Array is: "+ max_so_far);
    }
}
