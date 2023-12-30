package main.finale.DSA.patterns;

public class Demo5 {

    public static void main(String[] args) {
        printNum(4);
    }

    private static void printNum(int n) {
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=i; j<((2*n)-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
