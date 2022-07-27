package org.In_Walmart.strings;

public class SwapStringChars {
    private static String s = "Justin";
    public static void main(String[] args) {
        System.out.println(swapChars(s, 0, s.length()-1));
    }

    public static char[] swapChars(String s, int start, int end){
        char[] arr = s.toCharArray();
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }
}
