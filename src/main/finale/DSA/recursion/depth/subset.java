package main.finale.DSA.recursion.depth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class subset {

    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        rec("abcd", "", 0);
        System.out.println(list);
    }

    public static void rec(String input, String output, int index) {
        if(index>=input.length()) {
            list.add(output);
            return;
        }
        rec(input, output + input.charAt(index), index+1);
        rec(input, output, index+1);
    }
}
