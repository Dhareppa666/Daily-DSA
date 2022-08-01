package org;

//import javax.validation.constraints.Null;
import java.lang.reflect.Array;
import java.util.Stack;
import java.util.TreeSet;

public class Example {

    public static void main(String[] args) {
        //({[]}) -> YES
        //({]})  -> NO
//        System.out.println(isValidParenthesis("({[]}("));
//        System.out.println(getLargestString("azzzzz",2));
//        System.out.println(abb("azzzzz",2));
//        int a =0;
//        a = a+++a++ - a++ + ++a;
//        System.out.println(a);
//        something();
//        display(null);

//        System.out.println("is:"+(11<22<33));
//        System.out.println("is:"+(11>22>33));

//        TreeSet<Monkey> t = new TreeSet<Monkey>();
//        t.add(new Monkey(1));
//        t.add(new Monkey(2));
//        t.add(new Monkey(1));
//        System.out.println(t.size());

        Enums e = Enums.E;

    }
    static class Monkey{
        Monkey(int i){}
    }


    private static void display(Object o) {
        System.out.println("In Obj");
    }

    private static void display(String o) {
        System.out.println("In Str");
    }

    private static void display(StringBuffer o) {
        System.out.println("In Buff");
    }


    private static boolean something() {
        try {
            throw new ClassCastException();
        } catch (Exception e){
            throw  new NullPointerException();
        }
    }

    static String getLargestString(String s, int k) {
        int[] countArray = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars)
            countArray[c - 'a'] += 1;
        String result = "";
        int i = 25;
        while (i >= 0) {
            if (countArray[i] >= k) {
                int count = k;
                while (count > 0) {
                    result = result.concat(getLetter(i));
                    count--;
                }
                countArray[i] -= k;
                int j = i - 1;
                while (countArray[j] <= 0 && j > 0)
                    j -= 1;
                if (countArray[j] > 0 && j >= 0) {
                    result = result.concat(getLetter(j));
                    countArray[j] -= 1;
                } else {
                    break;
                }
            } else if (countArray[i] > 0) {
                int count = countArray[i];
                while (count > 0) {
                    result = result.concat(getLetter(i));
                    count--;
                }
                countArray[i] = 0;
            } else {
                i -= 1;
            }
        }
        return result;
    }

    private static String getLetter(int i) {
        return (char) (i + 'a') + "";
    }

    static String getLargestString2(String s, int k) {
        int[] frequency_array = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frequency_array[s.charAt(i) - 'a']++;
        }
        String ans = "";
        for (int i = 25; i >= 0; ) {
            if (frequency_array[i] > k) {
                int temp = k;
                String st = String.valueOf((char) (i + 'a'));
                while (temp > 0) {
                    ans += st;
                    temp--;
                }
                frequency_array[i] -= k;
                int j = i - 1;
                while (frequency_array[j] <= 0 &&
                        j >= 0) {
                    j--;
                }
                if (frequency_array[j] > 0 && j >= 0) {
                    String str = String.valueOf((char) (j + 'a'));
                    ans += str;
                    frequency_array[j] -= 1;
                } else {
                    break;
                }
            } else if (frequency_array[i] > 0) {
                int temp = frequency_array[i];
                frequency_array[i] -= temp;
                String st = String.valueOf((char) (i + 'a'));

                while (temp > 0) {
                    ans += st;
                    temp--;
                }
            } else {
                i--;
            }
        }
        return ans;
    }

    public static boolean isValidParenthesis(String s) { //{}()
        Stack<Character> stack = new Stack();//({[]})
        if (s.length() < 2) {//1 ( {
            return false;
        }

        int index = 0;
        while (index < s.length()) {// 6
            if (stack.empty()) {
                stack.push(s.charAt(index));//
            } else {
                if (stack.peek() == '(' && s.charAt(index) == ')') {
                    stack.pop();
                } else if (stack.peek() == '{' && s.charAt(index) == '}') {
                    stack.pop();
                } else if (stack.peek() == '[' && s.charAt(index) == ']') {
                    stack.pop();
                } else if (!stack.empty()) {
                    stack.push(s.charAt(index));
//                    return false;
                }
            }
            index++;
        }
        return stack.empty();
    }
}
