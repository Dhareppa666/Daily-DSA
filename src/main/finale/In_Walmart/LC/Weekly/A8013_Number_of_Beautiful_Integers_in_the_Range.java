package main.finale.In_Walmart.LC.Weekly;

public class A8013_Number_of_Beautiful_Integers_in_the_Range {

    public static void main(String[] args) {
        int res = numberOfBeautifulIntegers(1, 10, 1);
        System.out.println(res);
    }

    public static  int numberOfBeautifulIntegers(int low, int high, int k) {
        int res = 0;
        for(int i = low; i<=high; i++) {
            if(isValid(low) && (low % 3 == 0)) {
                System.out.println(low);
                res++;
            }
            low++;
        }
        return res;
    }

    public static boolean isValid(int num) {
        int odd = 0;
        int even = 0;
        while(num > 0) {
            int rem = num % 10 ;
            if(rem%2 == 0){
                even++;
            } else {
                odd++;
            }
            num = num /10;
        }
        return (odd == even);
    }
}
