package main.finale.In_Walmart.LC.Weekly;

public class removeSigleDigit {

    public static void main(String[] args) {
        String res = removeDigit("192833335", '3');
        System.out.println(res);
    }

    public static String removeDigit(String number, char digit) {
        int j = 0;
        for(int i=0; i<number.length(); i++) {
            if(digit == number.charAt(i)) {
                j = i;
                if(i < number.length()-1 && digit < number.charAt(i+1)) {
                    break;
                }
            }
        }
        number = number.substring(0, j) + number.substring(j+1);
        return number;
    }
}
