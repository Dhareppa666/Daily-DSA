package main.finale.In_Walmart.LC.Daily;

public class Find_the_difference {

    public static void main(String[] args) {
        char res = findTheDifference("abcd", "abcde");
        System.out.println(res);
    }

    public static char findTheDifference(String s, String t) {
        int[] temp = new int[26];
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            temp[c-'a']++;
        }
        int[] temp2 = new int[26];
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            temp2[c-'a']++;
        }
        for(int i=0; i<temp.length; i++) {
            if(temp[i] != temp2[i]) {
                return (char)(i+'a');
            }
        }
        return ' ';
    }
}
