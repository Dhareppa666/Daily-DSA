package main.finale.In_Walmart.nextLeap.arrays;

public class sumOfRange {

    public static void main(String[] args) {
        int start = 5;
        int end = 7;

        int sum = sumOfRange2(start, end);
        System.out.println("Sum of range: " + sum);
    }

    public static int sumOfRange2(int start, int end) {
        int n = end - start + 1;
        return (n * (start + end)) / 2;
    }

}
