package main.finale.nextLeap.graphs.class03.knapsack;

import java.util.*;

class Fractional_Knapsack {

    static class Item {
        int weight;
        int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    public static double fractionalKnapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(new Item(weights[i], values[i]));
        }
        items.sort((a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));
        double totalValue = 0.0;
        for (Item item : items) {
            if (item.weight <= capacity ) {
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                totalValue += ((double) capacity / item.weight) * item.value;
                break;
            }
        }
        return totalValue;
    }


    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;

        double maxValue = fractionalKnapsack(values, weights, capacity);
        System.out.println("Maximum Value: " + maxValue);
    }

}