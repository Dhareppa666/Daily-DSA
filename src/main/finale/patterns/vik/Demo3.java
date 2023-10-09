package main.finale.patterns.vik;

public class Demo3 {
    public static void main(String[] args) {
        print3(5);

    }

    private static void print3(int n) {
        boolean reached = false;
        for(int i=1; i<n*2; i++){
            if(!reached){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            } else {
                for(int j=n; j>(i%n); j--){
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i>=n){
                reached = true;
            }
        }
    }
}
