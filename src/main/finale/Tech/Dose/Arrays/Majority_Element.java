package main.finale.Tech.Dose.Arrays;

public class Majority_Element {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int me = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(count==0){
                count++;
                me = nums[i];
            } else if(me == nums[i])
                count++;
            else
                count--;
        }
        return me;
    }
}
