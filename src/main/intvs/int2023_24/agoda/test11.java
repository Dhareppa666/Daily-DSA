package main.intvs.int2023_24.agoda;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class test11 {

    /*
     * Complete the 'getMinimumSize' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY payloadSize
     *  2. INTEGER_ARRAY cacheA
     *  3. INTEGER_ARRAY cacheB
     *  4. INTEGER minThreshold
     */

    public static long getMinimumSize(List<Integer> payloadSize, List<Integer> cacheA, List<Integer> cacheB, int minThreshold) {
        // Write your code here
        int n = payloadSize.size();
        List<Integer> cacheAOnly = new ArrayList<>();
        List<Integer> cacheBOnly = new ArrayList<>();
        List<Integer> bothCaches = new ArrayList<>();

        for(int i=0; i<n; i++) {
            if(cacheA.get(i) == 1 && cacheB.get(i) == 1) {
                bothCaches.add(payloadSize.get(i));
            } else if(cacheA.get(i) == 1) {
                cacheAOnly.add(payloadSize.get(i));
            } else if(cacheB.get(i) == 1) {
                cacheBOnly.add(payloadSize.get(i));
            }
        }

        Collections.sort(cacheAOnly);
        Collections.sort(cacheBOnly);
        Collections.sort(bothCaches);

        int aCount = 0, bCount = 0, both = 0;
        long sum = 0l;

        while(aCount<minThreshold || bCount < minThreshold) {
            if(aCount < minThreshold && bCount<minThreshold && both<bothCaches.size()) {
                sum+= bothCaches.get(both++);
                aCount++;
                bCount++;
            } else if(aCount < minThreshold && !cacheAOnly.isEmpty()) {
                sum+=cacheAOnly.get(0);
                cacheAOnly.remove(0);
                aCount++;
            } else if(bCount <minThreshold && !cacheBOnly.isEmpty()) {
                sum+=cacheBOnly.get(0);
                cacheBOnly.remove(0);
                bCount++;
            } else {
                return -1;
            }
        }

        List<Integer> rem = new ArrayList<>(bothCaches);
        rem.addAll(cacheAOnly);
        rem.addAll(cacheBOnly);

        Collections.sort(rem);

        for(int payload: rem) {
            if(aCount >= minThreshold && bCount >= minThreshold) {
                break;
            }
            sum+=payload;
        }

        return sum;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int payloadSizeCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> payloadSize = IntStream.range(0, payloadSizeCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int cacheACount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> cacheA = IntStream.range(0, cacheACount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int cacheBCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> cacheB = IntStream.range(0, cacheBCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int minThreshold = Integer.parseInt(bufferedReader.readLine().trim());

//        long result = Result.getMinimumSize(payloadSize, cacheA, cacheB, minThreshold);

        long result = 0;
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
