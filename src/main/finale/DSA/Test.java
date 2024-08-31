package main.finale.DSA;

import java.util.*;

public class Test {

    static final int MOD = 1000000007;
    static final int MAX_PRIME = 1000000;
    static boolean[] isPrime;

    public static void main(String[] args) {
//        String s = "11375";
//        System.out.println("res: " + countPrimeStrings(s));  // Output: 3

        String input = "henry alba";
        String res = breakingBad(input);
        System.out.println(res);
    }

    public static int countPrimeStrings(String s) {
        // Step 1: Precompute primes up to MAX_PRIME using Sieve of Eratosthenes
        isPrime = new boolean[MAX_PRIME + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= MAX_PRIME; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX_PRIME; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;  // Base case: 1 way to split an empty string

        // Step 2: Fill the DP array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6 && i - j >= 0; j++) {  // Maximum 6 digits since 10^6 has 6 digits
                String sub = s.substring(i - j, i);
                if (sub.charAt(0) != '0') {  // No leading zeros allowed
                    int num = Integer.parseInt(sub);
                    if (num >= 2 && num <= MAX_PRIME && isPrime[num]) {
                        dp[i] = (dp[i] + dp[i - j]) % MOD;
                        System.out.println(num);
                    }
                }
            }
        }

        return dp[n];
    }

    public static String breakingBad(String str) {
        {
            List<String> elements = Arrays.asList("H", "He", "Li", "Be", "B", "C", "N", "F", "Ne", "Na", "Co",
                    "Ni", "Cu", "Ga", "Al", "Si", "Fa");

            Collections.sort(elements, (String a, String b) -> {
                return b.length() - a.length();
            });

            List<String> word = Arrays.asList(str.split(" "));
            Map<String, Boolean> m = new HashMap<>();

            String ans = "";
            for (String w : word) {
                String prev = w;
                for (String s : elements) {
                    w = w.replaceAll("(?i)" + s, "[" + s + "]");
                    if (!w.equals(prev)) {
                        ans = ans + w + ' ';
                        m.put(prev, true);
                        break;
                    }
                }
                if (!m.containsKey(prev))
                    ans = ans + prev + ' ';
            }
            return ans.trim();
        }
    }
}