package main.intvs.int2023_24.Salesforce;

public class Round_03 {

    //06th-Nov-2024, 8:00PM (IST) - 8:45PM (IST): Sumuga Padman (Lead Software Engineer, UX Engineering)

    // Tell me about the biggest challenge you faced and how you resolved it.
    // what is preFlight Request and CORS stuff
}

//import java.time.LocalDate;
//import java.util.*;
//        import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//        //
//        getTopNCustomers(5);
//    }
//
//    public static double getTotalRevenue() {
//        List<Order> allOrders = new ArrayList<>();
//        return allOrders.stream().reduce(0d, (order1, order2)-> order1.amount + order2.amount));
//    }
//
//    public static Map<String, List<String>> getTopNCustomers(int n) {//2
//        // List<Customers> with me as input
//        List<Order> allOrders = new ArrayList<>();
//
//        Map<String, List<String>> topNCustomersMap = new HashMap<>();
//
//        Collections.sort(allOrders, (ord1, ord2) -> Double.compare(ord2.amount, ord1.amount));
//
//        allOrders.forEach((order)->{
//            if(topNCustomersMap.containsKey(order.orderDate().getMonth())) {
//                if(topNCustomersMap.get(order.orderDate().getMonth()).size() < n) {
//                    topNCustomersMap.put(order.orderDate().getMonth(), topNCustomersMap.get(order.orderDate().getMonth()).add(order.customerId));
//                }
//            } else {
//                topNCustomersMap.put(order.orderDate().getMonth(), List.of(order.customerId)); //map.getOrDefault
//            }
//        });
//
//        return topNCustomersMap;
//
//        // Group by LocalDate.getMonth(),
////        Map<String, List<String>> groupByMonthData = allOrders.stream().collect(Collectors.groupingBy(order.,
////                (order)-> order.orderDate().getMonth())
////        );// should have key as month and value as all customerIds
////
////        for(Map.Entry<String, List<String>> m: groupByMonthData.entrySet()) {
////            if(m.getValue().size() > n) {
////
////            }
////        }
////        return groupByMonthData;
//
////        for(int month = 1; month <= 12; month++) {
//////            allOrders.stream().filter((order) -> order.orderDate )
////        }
//
//    }
//
//}
//
//// Java
//class Order {
//    private String orderId;
//    private String customerId;
//    private double amount; // Total amount paid for the order
//    private LocalDate orderDate;
//    private List<OrderItem> items; // Each order can have multiple items
//}
//
//class OrderItem {
//    private String productId;
//    private int quantity;
//    private double price;
//}

//class OrderService {
//    // Implement methods in here.
//}
