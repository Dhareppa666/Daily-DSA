package main.finale.In_Walmart.nextLeap.backTracking;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int numBoys = 2;
        int numGirls = 2;
        List<String> arrangements = findSeatingArrangements(numBoys, numGirls);
        for (String arrangement : arrangements) {
            System.out.println(arrangement);
        }
    }

    public static List<String> findSeatingArrangements(int numBoys, int numGirls) {
        List<String> arrangements = new ArrayList<>();
        char[] seats = new char[numBoys + numGirls];
        for (int i = 0; i < numBoys; i++) {
            seats[i] = 'B'; // B represents boys
        }
        for (int i = numBoys; i < numBoys + numGirls; i++) {
            seats[i] = 'G'; // G represents girls
        }
        backtrack(arrangements, seats, 0);
        return arrangements;
    }

    private static void backtrack(List<String> arrangements, char[] seats, int index) {
        if (index == seats.length) {
            arrangements.add(new String(seats));
            return;
        }

        for (int i = index; i < seats.length; i++) {
            // place i-th integer first
            // in the current permutation
            if (isValid(seats, index, i)) {
                swap(seats, index, i);
                backtrack(arrangements, seats, index + 1);
                swap(seats, index, i); // backtrack by restoring the original state
            }
        }
    }

    private static boolean isValid(char[] seats, int index, int i) {
        // Check if two girls are sitting next to each other in the new arrangement

        //seats[index] == 'G' and (seats[i + 1] == 'G' || seats[i - 1] == 'G')
        if (seats[index] == 'G') {
            if(i + 1 < seats.length && seats[i + 1] == 'G') {
                return false;
            }
            if(i - 1 >= 0 && seats[i - 1] == 'G') {
                return false;
            }
        }
        if (seats[i] == 'G') {
            if(index + 1 < seats.length && seats[index + 1] == 'G') {
                return false;
            }
            if (index - 1 >= 0 && seats[index - 1] == 'G') {
                return false;
            }
        }
        return true;
    }

    private static void swap(char[] seats, int i, int j) {
        char temp = seats[i];
        seats[i] = seats[j];
        seats[j] = temp;
    }
}