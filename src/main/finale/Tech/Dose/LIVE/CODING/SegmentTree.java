package main.finale.Tech.Dose.LIVE.CODING;

import main.finale.util.AllInOneUtils;

public class SegmentTree {

    public static int[] st;

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, -2, 4, 5};
        int n = arr.length;
        st = new int[(4 * n) + 1];
        int st_idx = 1;
        int start = 0, end = n - 1;

        AllInOneUtils.printArr(st);

        //Preprocessosing.
        buildSegTree(st_idx, arr, start, end);

        AllInOneUtils.printArr(st);


        updateNode(st_idx, start, end, 10, 10);


    }

    private static void updateNode(int st_idx, int start, int end, int pos, int newVal) {
        if (start > pos || end < pos) //No Overlap Case.
            return;
        if (start == pos) {//Leaf Case (Total Overlap)
            st[st_idx] = newVal;
            return;
        }
        //Partial Overlap.
        int middle = start + (end - start) / 2;
        updateNode(2 * st_idx, start, middle, pos, newVal);
        updateNode(2 * st_idx + 1, middle + 1, end, pos, newVal);
        st[st_idx] = st[2 * st_idx] + st[2 * st_idx + 1];
    }

    public int query(int qs, int qe, int st_idx, int start, int end) {
        if (qs > end || qe < start)
            return 0;
        if (start >= qe && end <= qe)
            return st[st_idx];
        //Partieal Overlap
        int middle = start + (end - start) / 2;
        int leftSum = query(qs, qe, 2 * st_idx, start, middle);
        int rightSum = query(qs, qe, 2 * st_idx + 1, middle + 1, end);
        return leftSum + rightSum;
    }

    private static void buildSegTree(int st_idx, int[] arr, int start, int end) {
        if (start > end) //invalid Case
            return;
        if (start == end) //LeafNode Case
            st[st_idx] = arr[start];
        //Intermediate Cases.
        int middle = start + (end - start) / 2;
        buildSegTree(2 * st_idx, arr, start, middle);
        buildSegTree(2 * st_idx + 1, arr, middle + 1, end);
        st[st_idx] = st[2 * st_idx] + st[2 * st_idx + 1];
    }
}
