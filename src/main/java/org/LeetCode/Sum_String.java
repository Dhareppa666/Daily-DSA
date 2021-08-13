package org.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Sum_String
{
    public static void main(String[] args) {
        //System.out.println(addStrings("123", "11"));
        //System.out.println(addStrings("456", "77"));//533
//        System.out.println(addStrings("1", "9"));//533
        //System.out.println(addStrings2("123", "11"));//533
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(null, null);
        map.put(null, null);
        map.put(null, 55);
        map.put(null, 26);
        map.put(1, 11);
        map.put(2, 22);
        map.put(1, 111);

        System.out.println(map);
    }

    public static String addStrings2(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return sb.reverse().toString();
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int num11 = num1.length()-1;
        int num22 = num2.length()-1;
        boolean isCarry = false;
        int carry = 1;
        while(num11>=0 || num22>=0 || isCarry){
            if (num11<0 && num22<0 && isCarry) {
                sb.append(carry);
                break;
            }
            Integer temp = 0;
            if(num11>=0 && num22>=0){
                temp = Integer.parseInt(String.valueOf(num1.charAt(num11))) +  Integer.parseInt(String.valueOf(num2.charAt(num22)));
            } else if(num11<0){
                temp = Integer.parseInt(String.valueOf(num2.charAt(num22)));
            } else {
                temp = Integer.parseInt(String.valueOf(num1.charAt(num11)));
            }
            if(isCarry){
                temp += carry;
                carry = 1;
                isCarry = false;
            }
            if(temp>9){
                isCarry = true;
                carry = temp/10;
                temp = temp%10;
            }
            sb.append(temp);
            num11--;
            num22--;
            System.out.println(temp);
        }
        return sb.reverse().toString();
    }
}
