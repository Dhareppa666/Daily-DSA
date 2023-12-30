package main.finale.DSA.linked_list;

public class LL_With_arrays {

    private int size;//5
    private int index = -1;//4

    private int[] ll = new int[size];

    public LL_With_arrays(int size){
        this.size = size;
    }

    public static void main(String[] args) {
        LL_With_arrays list = new LL_With_arrays(5);
        list.add(5);
    }

    private void add(int val) {
        if(index >= size-1){
            System.out.println("LinkedList is Full");
            return;
        }
        ll[++index] = val;
    }

    private void remove(int val) {
//        if(index == -1){
//            System.out.println("LinkedList is Empty");
//        } else {
//            for(int i=0; i<=index; i++){
//                if(val == ll[i]){
//                    for(int j=)
//                }
//            }
//        }
    }
}
