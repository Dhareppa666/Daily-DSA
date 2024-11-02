package main.intvs.int2023_24.walmart;
import java.util.*;

public class Round11 {
    private PriorityQueue<Product> minHeap;

    private Integer DEFAULT_PRICE_INCREEMENTER = 1;

    public static void main(String[] args) {

    }

    // HashMap<Product, price> =>

//    public void initializeProducts(List<Product> allProducts) {
//        this.minHeap = new PriorityQueue<>((p1,p2) -> p1.price - p2.price);
//        for(Product product: allProducts) {
//            minHeap.offer(product);
//        }
//    }
//
//    public void addProduct(Product product) {
//        if(minHeap == null) {
//            return null;// throw Custom Exception
//        }
//        // Validate Product params before adding into Heap
//        minHeap.offer(product);
//    }
//
//    pubic Product getProduct() throws Exception {
//        if(minHeap == null || minHeap.size()==0) {
//            return null;// throw Custom Exception
//        }
//        Product product = minHeap.poll();
//        product.setPrice(product.price + DEFAULT_PRICE_INCREEMENTER);// AutomicInteger or
//        minHeap.offer(product);
//        return product;
//    }
}


class Product {
    private String name;
    private Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    // setPrice()
}

// arr of products
// name, price ->

// p1: 1,
// p2: 2,
// p3: 3
// ...
// n

// q*(O(1))*O(logn) -> O(q*logn)


// board m*n
// (x1,y1) => (x2,y2)

// 1,2,0
// 0,0,0
// 0,0,0
  