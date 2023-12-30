package main.finale.nextLeap.arrays;

import java.util.ArrayList;
import java.util.List;

//TODO: aur ek baar dekle.
public class Get_all_Divisors {

    public static void main(String[] args) {
        List<Integer> list = getDivisors(62);
        list.forEach(x-> System.out.print(x+","));
        System.out.println();
        System.out.println(Math.sqrt(62));
    }

    public static List<Integer> getDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                if (i != number / i) {
                    divisors.add(number / i);
                }
            }
        }

        return divisors;
    }
}
