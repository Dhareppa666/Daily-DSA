package org.REAL_TIME_COMP_QUES.EzeTap;

import java.util.Scanner;

public class ezetap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = 1;
        for (int n = 0; n < t; n++) {
            String tom = "12345efd";
            String jerry = "1e3d";
            String result = "NO";

            if(tom.length() <1 || jerry.length() <1 ){
                System.out.println(result);
                continue;
            }
            //12sd78f
            //sf
            int i=0, j=0;
            StringBuilder sb = new StringBuilder();
            while(i<tom.length() && j<jerry.length()){
                if(tom.charAt(i) == jerry.charAt(j) ){
                    sb.append(tom.charAt(i));
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
            System.out.println(sb.toString());
            if(sb.toString().equals(tom) || sb.toString().equals(jerry)){
                result = "YES";
            }

            System.out.println(result);
        }

    }

}
