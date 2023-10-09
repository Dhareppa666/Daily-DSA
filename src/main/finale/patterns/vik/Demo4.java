package main.finale.patterns.vik;

public class Demo4 {

    public static void main(String[] args) {
        printBinaryPattern(5);
    }

    private static void printBinaryPattern(int n) {
        for(int i=1; i<=n; i++){
            for (int j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
