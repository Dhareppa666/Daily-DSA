package main.finale.Tech.Dose.Arrays;

public class trapping_rain_water {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};//6
        int res = trap(arr);
        System.out.println("The tappable rain water is: " + res);

        int[] arr2 = {4, 2, 0, 3, 2, 5};//9
        res = trap(arr2);
        System.out.println("The tappable rain water is: " + res);
    }

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int result = 0;
        // leftMax represents the highest bar from left
        int leftMax = Integer.MIN_VALUE;
        // rightMax represents the highest bar from right
        int rightMax = Integer.MIN_VALUE;

        // use two pointers to scan the entire array until they meet with each other
        // Key points: any bars in the middle of leftMax bar and rightMax bar will not influence
        // how much water can current position trap
        int left = 0, right = height.length - 1;
        while (left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            //how much can current position trap depends on the shorter bar (木桶原理)
            if (leftMax < rightMax) {
                //DO NOT Fmain.finaleET to subtract bar height of current position
                result += leftMax - height[left];
                left++;
            } else {
                result += rightMax - height[right];
                right--;
            }
        }
        return result;
    }




























    public int tapWater(int[] height){
        if (height == null || height.length==0)
            return 0;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        int result = 0;
        int left =0, right = height.length-1;
        while (left<=right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if(leftMax < rightMax){
                result +=leftMax - height[left];
                left++;
            } else {
                result += rightMax - height[right];
                right--;
            }
        }
        return result;
    }





}
