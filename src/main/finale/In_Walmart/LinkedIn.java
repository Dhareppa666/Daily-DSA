package org.In_Walmart;

//3(BC) => BCBCBC
//2(A)B => AAB
//3(Y2(b)) => 3(Ybb) => YbbYbbYbb

// 3Y2b

// b2Y3 --> bbY3 --> 3Ybb

// O(n)

//3(YX2(bzz)cd)ABC => 3(YXbzzbzz) => YXbzzbzz YXbzzbzz YXbzzbzz
//YXbbzzbzzcd

// string: 3 ( Y X 2 ( b z z ) c d )
// string: Y X b z z b z z c d  Y X b z z b z z c d   Y X b z z b z z c d   -

import java.util.*;
//zzb --> bzz  --> 2 * -->


// RESULT:  bzzbzz

// bzzbzz
class LinkedIn {
    public static void main(String[] args) {
        //3(YX2(bzz)cd)ABC      -->  3YX2bzz

        String input = "2(A)B";
        Stack<String> stack = new Stack<String>();// 3
        String tempStr = "";
        for(int index= 0; index< input.length(); index++){
            char currentChar = input.charAt(index);
            if(currentChar == '('){
                continue;
            } else if(currentChar == ')'){
                String topStr = tempStr; // 3xybzzbzzcd
                String reverseStr = new StringBuilder(topStr).reverse().toString(); // 3YXbzzbzzcd -> cdzzbzzbXY3
                String newTopStr = getNumIndex(reverseStr);// zzb zzb xy3
                reverseStr = new StringBuilder(newTopStr).reverse().toString(); // 3YX2bzz -> zzb2XY3
                tempStr = reverseStr;//
//                stack.push(newTopStr); //zzbzzb xy3
            } else {
                tempStr = tempStr + currentChar; // YXbzzbzzcd YXbzzbzzcd YXbzzbzzcd ABC
            }
        }
    }

    private static String getNumIndex(String topStr) {//zzb2xy3
        int numIndex = -1;//3
        for(int index = 0 ; index<topStr.length(); index++){
            if(topStr.charAt(index) < 65 ){
                numIndex = index;
                break;
            }
        }
        String newSubString = topStr.substring(0, numIndex);//zzb
        for(int index = 0 ; index<topStr.charAt(numIndex); index++){//3
            newSubString = newSubString + newSubString ;// zzbzzb
        }
        topStr  = topStr.substring(numIndex);// xy3
        topStr =  newSubString + topStr; // zzb zzb + xy3  ==>  zzb zzb xy3

        return topStr;
    }
}