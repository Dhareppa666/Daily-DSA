package main.intvs.int2023_24.walmart;

import java.util.*;

public class Intv_08 {


// You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

// Merge all the linked-lists into one sorted linked-list and return it.

// Input: lists = [[1,4,5],[1,3,4],[2,6]]
// Output: [1,1,2,3,4,4,5,6]
// Explanation: The linked-lists are:
// [
//   1->4->5,
//   1->3->4,
//   2->6
// ]
// merging them into one sorted list:
// 1->1->2->3->4->4->5->6
// public int[] mergeKLists(int[][] lists) {
// }


//========

    //[[1,4,5],[1,3,4],[2,6]]
// PQ: [[1,3,4],[1,4,5],[2,6]] initial --> 1
// PQ: [[1,4,5], [2,6], [3,4]] --> 1
//    public List mergeKLists(LinkedList<LinkedList<Integer>> lists) {
//        PriorityQueue pq = new PriorityQueue<LinkedList>((a, b) -> a.get(0) - b.get(0));
//        for (LinkedList linkedList : lists) {
//            pq.add(linkedList);
//        }
//
//        ArrayList<Integer> result = new ArrayList<>();
//        while (pq.size() != 0) {
//            LinkedList curr = pq.poll();
//            result.add(curr.get(0));
//            curr = curr.next;
//            if (curr != null) {
//                pq.add(curr);
//            }
//        }
//        return result;
//    }
}
