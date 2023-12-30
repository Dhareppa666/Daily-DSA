package main.finale.DSA.recursion;

public class LengthofStringUsingRec {

    public static void main(String[] args) {
        int a = printLengthOfStering("HELLO");
        System.out.println(a);
    }

    private static int printLengthOfStering(String s) {
        if(s.equals("")){
            return 0;
        }
        return 1+ printLengthOfStering(s.substring(1));
    }
}
