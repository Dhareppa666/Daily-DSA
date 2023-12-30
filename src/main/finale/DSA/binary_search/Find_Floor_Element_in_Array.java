package main.finale.DSA.binary_search;

public class Find_Floor_Element_in_Array {

    public static void main(String[] args) {
        int res = findFloor(new long[]{1,2,8,10,11,12,19}, 20);
        System.out.println("The floor element is: "+res);
    }

    public static int findFloor(long arr[], long x)
    {
        if(x<arr[0]){
            return -1;
        }
        long start = 0, end = arr.length;
        while(start<end){
            long mid = start + (end-start)/2;
            int m = (int) mid;
            if(arr[m]>x){
                end = mid-1;
            } else {
                start = mid;
            }
            if(m == start){
                break;
            }
        }
        long l = arr[(int) start];
        int s = (int) l;
        return s;
    }
}
