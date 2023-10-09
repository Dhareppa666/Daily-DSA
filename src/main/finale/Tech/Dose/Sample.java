package main.finale.Tech.Dose;


import main.finale.apache.commons.lang3.StringUtils;

public class Sample {

    public static void main(String[] args) {
//        System.out.println(1<<3);
        //System.out.println(hammingWeight(7));
        //System.out.println(majorityElement(new int[]{1,1,2,2,2,1,2, 9, 6,3}));
        //countBits(5);
       // System.out.println(findSubString("GEEKSGEEKSFOR"));
        System.out.println(StringUtils.leftPad("abcd", 8, '0'));
        System.out.println(StringUtils.leftPad(StringUtils.right("123456", 9), 11, '0'));
        System.out.println(StringUtils.right("123456", 9)); // Res: 123456 [string is lesser than the length so return same]
        System.out.println(StringUtils.right("1234567890ABCDEFGHIJ", 9)); // Res: Last 9 Digits will be picked : BCDEFGHIJ
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

    public static int findSubString(String str){
        // Your code goes here
        int max = 0;
        int curr = 0;
        char c = str.charAt(0);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != c){
                curr++;
                c = str.charAt(i);
            } else {
                curr = 1;
                c = str.charAt(i);
            }
            if(curr>max)
                max = curr;
        }
        return max;
    }
}
