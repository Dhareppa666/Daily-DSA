package main.finale.In_Walmart.nextLeap.extras;

public class Test {
    public static void main(String[] args) {
        String res = maximumOddBinaryNumber("0101");
        System.out.println(res);
    }

    public static String maximumOddBinaryNumber(String s) {
        int index = 0;
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
            if (arr[i] == '1' && i!=arr.length-1) {
                char temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        if (arr[arr.length - 1] == '0') {
            char temp = arr[index];
            arr[index] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        return new String(arr);
    }
}
