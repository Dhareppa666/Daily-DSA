package org.Tech.Dose;

public class Sample {

    public static void main(String[] args) {
//        System.out.println(1<<3);
        //System.out.println(hammingWeight(7));
        //System.out.println(majorityElement(new int[]{1,1,2,2,2,1,2, 9, 6,3}));
        countBits(5);
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n &=n-1;
            count++;
        }
        return count;
    }

    public static int majorityElement(int[] nums) {
        int major = nums[0];
        int counter = 1;
        for(int i=1; i<nums.length; i++){
            if(counter == 0){
                major = nums[i];
                counter++;
            } else if(major == nums[i]){
                counter++;
            } else {
                counter --;
            }
        }
        return major;
    }

    public static int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0; i<=n; i++){
            res[i] = res[i>>1] + (i&1);
            System.out.println(i+":"+res[i]);
        }
        return res;
    }
}
