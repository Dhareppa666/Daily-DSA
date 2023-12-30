package main.finale.DSA.linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class Testing {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext()){
            Integer curr = itr.next();
            if(curr == 2){
                itr.remove();
            }
            System.out.println(curr);
        }

        System.out.println(linkedList);
    }
}
