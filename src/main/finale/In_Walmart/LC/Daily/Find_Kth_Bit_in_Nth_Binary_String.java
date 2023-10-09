package main.finale.In_Walmart.LC.Daily;

//1545. Find Kth Bit in Nth Binary String
public class Find_Kth_Bit_in_Nth_Binary_String {

    public static void main(String[] args) {
        Find_Kth_Bit_in_Nth_Binary_String obj = new Find_Kth_Bit_in_Nth_Binary_String();
        char res = obj.findKthBit(4,11);
        System.out.println(res);
    }

    //Input: n = 3, k = 1
    //Output: "0"
    //Explanation: S3 is "0111001".
    //The 1st bit is "0".
    public char findKthBit(int n, int k) {
        StringBuilder res = getString(n);
        System.out.println(res);
        return res.charAt(k-1);
    }

    public StringBuilder getString(int n){
        if(n==1){
            return new StringBuilder("0");
        } else if(n==2){
            return new StringBuilder("011");
        } else if(n==3){
            return new StringBuilder("0111001");
        } else if(n==4){
            return new StringBuilder("011100110110001");
        } else {
            StringBuilder x = getString(n-1);
            return new StringBuilder(x + "1" + (new StringBuilder(invert(x)).reverse().toString()));
        }
    }

    public StringBuilder invert(StringBuilder s){
        StringBuilder x = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            x.append(s.charAt(i) == '0' ? '1' : '0');
        }
        return x;
    }
}
