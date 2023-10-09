package main.finale.Tech.Dose.sorting;

public class CountingSort3 {

    public static void main(String args[]) {
        char[] arr = {'a', 'b', 'a', 's', 'c', 's'};
//        printOccuranceOfCharacters(arr);
        System.out.println(5 + 5 + "5" + 5);
    }

    public static void printOccuranceOfCharacters(char[] arr) {
        int[] counter = new int[256];
        int length = arr.length;

        // Count frequency of every character and store it in counter array
        for (int i = 0; i < length; i++) {
            counter[(int) arr[i]]++;
        }
        // Print Frequency of characters
        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }
}
