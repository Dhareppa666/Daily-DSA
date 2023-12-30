package main.finale.DSA.patterns;

public class Demo6 {

    public static void main(String[] args) {
        printDa(4);
    }

    private static void printDa(int n) {///4
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            int counter = 65;
            for(int j=1; j<=i; j++){
                System.out.print((char)counter);
                counter++;
            }
            counter--;
            for(int j=1; j<i; j++){
                counter--;
                System.out.print((char)counter);
            }
            System.out.println();
        }
    }
}
