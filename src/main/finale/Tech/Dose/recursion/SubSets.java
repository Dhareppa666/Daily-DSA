package main.finale.Tech.Dose.recursion;

import java.util.LinkedList;
import java.util.List;

public class SubSets {

    private static List<String> list = new LinkedList<>();

    public static void main(String[] args) {
        String[] s = {"a", "b", "c", "d"};
        subSets(s, 0, "");
        System.out.println(list);
    }

    public static void subSets(String[] s, int pos, String curr) {
        if (pos == s.length) {
            list.add(curr);
            return;
        }
        subSets(s, pos + 1, curr);
        curr = curr + s[pos];
        subSets(s, pos + 1, curr);
    }
}
