package main.finale.REAL_TIME_COMP_QUES.EzeTap;

import java.util.Scanner;

//Anagrams of a String.
public class ezetap02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int n = 1; n <= t+1; n++) {
            String s = sc.nextLine();
            permute(s, "");
            System.out.println();
        }
    }

    public static void permute(String s,String answer){
        if (s.length() == 0){
            System.out.print(answer + "  ");
            return;
        }

        for(int i = 0 ;i < s.length(); i++){
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }
}