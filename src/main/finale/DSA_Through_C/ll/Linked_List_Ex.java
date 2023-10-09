package main.finale.DSA_Through_C.ll;

public class Linked_List_Ex {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Linked_List_Ex linked_List = new Linked_List_Ex();

        linked_List = insert(linked_List, 1);
        linked_List = insert(linked_List, 1);
        linked_List = insert(linked_List, 2);
        linked_List = insert(linked_List, 3);
        linked_List = insert(linked_List, 3);

        Node res = deleteDuplicates(linked_List);


        System.out.println(res);




//        linked_List = insert(linked_List, 30);
//        linked_List = insert(linked_List, 40);
//        linked_List = insert(linked_List, 50);
//        linked_List = insert(linked_List, 60);
//        printLinked_List(linked_List);
//
//        System.out.println();
//        linked_List = deleteByKey(linked_List, 60);
//        printLinked_List(linked_List);

    }

    public static Node deleteDuplicates(Linked_List_Ex head) {
        Node prev = head.head, curr = head.head;
        while(curr!=null){
            if(prev.data != curr.data){
                prev.next = curr;
            }
            curr = curr.next;
        }
        return prev;
    }

    private static Linked_List_Ex deleteByKey(Linked_List_Ex linked_list, int key) {
        Node currNode = linked_list.head, prev = null;
        //1st approach.
        if(currNode != null && currNode.data == key){
            linked_list.head = currNode.next;
            System.out.println("Element Found in Linked list and Deleted.1");
            return linked_list;
        }

        //2nd Approach.
        while (currNode != null && currNode.data != key){
            prev = currNode;
            currNode = currNode.next;
        }

        if(currNode!=null && currNode.data == key){
            System.out.println("Element Found in Linked list and Deleted.2");
            prev.next = currNode.next;
        }

        //3rd approach.
        if(currNode == null){
            System.out.println("Element Not Found in Linked list...!!!3");
        }
        return linked_list;
    }

    private static void printLinked_List(Linked_List_Ex linked_list) {
        Node currentNode = linked_list.head;
        System.out.print("The Linked List is : ");
        while (currentNode.next != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

    }

    private static Linked_List_Ex insert(Linked_List_Ex linked_list, int data) {
         Node currentNode = new Node(data);
         currentNode.next = null;

         if (linked_list.head == null){
             linked_list.head = currentNode;
         } else {
             Node lastNode = linked_list.head;
             while (lastNode.next != null){
                 lastNode = lastNode.next;
             }
             lastNode.next = currentNode;
         }
         return linked_list;
    }
}
