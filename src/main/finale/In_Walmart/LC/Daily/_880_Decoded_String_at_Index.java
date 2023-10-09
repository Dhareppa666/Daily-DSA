package main.finale.In_Walmart.LC.Daily;

public class _880_Decoded_String_at_Index {

    public static void main(String[] args) {
        String res = decodeAtIndex("leet2code3", 10);
        System.out.println(res);
    }

    public static String decodeAtIndex(String s, int k) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            boolean isNumber = s.charAt(i) < 97;
            if(isNumber) {
                int num = Integer.parseInt(String.valueOf(s.charAt(i)));
                String temp = res.toString();
                while(num>1) {
                    res.append(temp);
                    num--;
                }
            } else {
                res.append(s.charAt(i));
            }
            if(res.length()>=k) {
                return String.valueOf(res.charAt(k-1));
            }
        }
        return String.valueOf(res.charAt(k-1));
    }
}
