package main.finale.REAL_TIME_COMP_QUES.DASSAULT;

public class Sample01 {
    public static void main(String[] args) {
        printTriangle();
    }

    private static void printTriangle() {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {//0,1,2,3
                if (j == i || j == n - 1 || j == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {//0,1,2,3,4
                if (j == 0 || j == i || i == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
