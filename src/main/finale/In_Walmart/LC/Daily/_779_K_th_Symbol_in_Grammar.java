package main.finale.In_Walmart.LC.Daily;

//Row1	        			  0
//						  /       \
//Row2					0          1
//					   /   \      /    \
//Row3				  0     1     1      0
//					 / \    / \   / \   / \
//Row4				0  1   1   0  1  0  0  1
//
//Index(for Row 4)->  1  2   3   4  5  6  7  8

public class _779_K_th_Symbol_in_Grammar {

    public static void main(String[] args) {
        int res = kthGrammar(4, 5);
        System.out.println(res);
    }

    public static int kthGrammar(int n, int k) {
        int curr = 0;
        int left = 1, right = (int) Math.pow(2, n - 1);
        for (int i = 1; i <= n; i++) {
            int mid = left + (right - left) / 2;
            if (k <= mid) {
                right = mid;
            } else {
                left = mid + 1;
                curr = (curr == 0) ? 1 : 0;
            }
        }
        return curr;
    }
}
