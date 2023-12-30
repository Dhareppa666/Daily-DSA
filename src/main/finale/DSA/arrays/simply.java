package main.finale.DSA.arrays;

import java.util.Scanner;
import java.util.UUID;

public class simply {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        print_01();
//        System.out.println();
//        print_02();
//        System.out.println();
//        print_03();
//        System.out.println();
//        print_04();
//        System.out.println();
//        print_05();
//        System.out.println();
//        print_06();
//        System.out.println();
//        print_07();
//        System.out.println(Long.parseLong("00000200"));
        final String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
    }

    private static void print_01() {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void print_02() {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(j + " ");
            }
            for (int j = (n - i + 1); j <= n; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }

    private static void print_03() {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j || i == n) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void print_04() {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " " + (n - i) + " " + (n + i + 1) + " " + ((2 * n) - i) + " " + ((2 * n) + i + 1) + " " + ((n + n + n) - i));
        }
        System.out.println();
    }

    private static void print_05() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("B ");
            }
            System.out.println();
        }
    }

    private static void print_06() {
        char[] ch1 = {'a', 'b', 'c', 'd'};
        char[] ch2 = {'w', 'x', 'y', 'n'};
        for (int i = 0; i < ch1.length; i++) {
            char temp = ch1[i];
            ch1[i] = ch2[i];
            ch2[i] = temp;
        }
        for (char ch : ch1) {
            System.out.print(ch);
        }
        System.out.println();
        for (char ch : ch2) {
            System.out.print(ch);
        }
    }

    private static void print_07() {
        char[] ch = {'a', 'b', 'c', 'd', 'i', '0', '<', 'z', 'e'};
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 97 || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
