package main.intvs.int2023_24.apple.nov;

import java.util.*;

public class Round_03 {
}


class Product {
    String name;
    String category;
    int weight;

    Product(String name, String category, int weight) {
        this.name = name;
        this.category = category;
        this.weight = weight;
    }
}

class ProductCombination {

    public static void main(String[] args) {
        // Sample list of products
        List<Product> products = Arrays.asList(
                new Product("Product1", "Category1", 3),
                new Product("Product2", "Category1", 2),
                new Product("Product3", "Category2", 4),
                new Product("Product4", "Category2", 5),
                new Product("Product5", "Category3", 1)
        );

        int capacity = 6;

        List<List<Product>> result = findCombinations(products, capacity);
        System.out.println("Combinations:");
        for (List<Product> combination : result) {
            System.out.println(combination);
        }
    }

    public static List<List<Product>> findCombinations(List<Product> products, int capacity) {
        List<List<Product>> result = new ArrayList<>();
        Map<String, List<Product>> categoryMap = new HashMap<>();

        // Group products by category
        for (Product product : products) {
            categoryMap.computeIfAbsent(product.category, k -> new ArrayList<>()).add(product);
        }

        // Collect all categories
        List<String> categories = new ArrayList<>(categoryMap.keySet());
        backtrack(result, new ArrayList<>(), categoryMap, categories, 0, capacity, 0);
        return result;
    }

    private static void backtrack(List<List<Product>> result, List<Product> currentCombination,
                                  Map<String, List<Product>> categoryMap, List<String> categories,
                                  int currentCategoryIndex, int remainingCapacity, int categoriesUsed) {
        if (remainingCapacity == 0 && categoriesUsed == categories.size()) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        if (currentCategoryIndex >= categories.size() || remainingCapacity < 0) {
            return;
        }

        String currentCategory = categories.get(currentCategoryIndex);
        List<Product> productsInCategory = categoryMap.get(currentCategory);

        // Try all products in the current category
        for (Product product : productsInCategory) {
            currentCombination.add(product);
            backtrack(result, currentCombination, categoryMap, categories, currentCategoryIndex + 1,
                    remainingCapacity - product.weight, categoriesUsed + 1);
            currentCombination.remove(currentCombination.size() - 1);
        }

        // Skip the current category
        backtrack(result, currentCombination, categoryMap, categories, currentCategoryIndex + 1,
                remainingCapacity, categoriesUsed);
    }
}

