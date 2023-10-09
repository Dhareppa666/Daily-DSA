package main.finale.In_Walmart.Raj_Vik.Recursion;

public class Print_name_n_times {

    public static void main(String[] args) {
        printNames(6);
    }

    private static void printNames(int i) {
        if(i==0)
            return;
        System.out.println("My name");
        printNames(i-1);
    }
}
