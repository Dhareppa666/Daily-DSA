package main.finale.Tech.Dose.Arrays;

public class TEST {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        int totalSum = n;
        while(totalSum>1){
            int sum = 0;
            while(totalSum>0){
                int rem = totalSum%10;
                sum += rem * rem;//81
                totalSum/=10;
            }
            totalSum = sum;
        }
        return totalSum == 1;
    }
}
