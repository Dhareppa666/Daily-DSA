package main.finale.extras;

import java.util.Random;

public class WeightedRandomCharacterStream {

    public static String generateWeightedRandomStream(char[] characters, double[] weights, int length) {
        // Normalize weights so they sum to 1
        double totalWeight = 0.0;
        for (double weight : weights) {
            totalWeight += weight;
        }

        double[] cumulativeWeights = new double[weights.length];
        double cumulativeSum = 0.0;
        for (int i = 0; i < weights.length; i++) {
            cumulativeSum += weights[i] / totalWeight;
            cumulativeWeights[i] = cumulativeSum;
        }

        Random random = new Random();
        StringBuilder randomStream = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            double r = random.nextDouble();
            int index = binarySearch(cumulativeWeights, r);
            randomStream.append(characters[index]);
        }

        return randomStream.toString();
    }

    private static int binarySearch(double[] cumulativeWeights, double value) {
        int low = 0;
        int high = cumulativeWeights.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (cumulativeWeights[mid] > value) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'c', 'd'};
        double[] weights = {0.1, 0.2, 0.3, 0.4}; // Sum of weights should be 1
        int length = 20;

        String randomStream = generateWeightedRandomStream(characters, weights, length);
        System.out.println(randomStream);
    }
}

