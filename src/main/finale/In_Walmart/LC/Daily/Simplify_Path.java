package org.In_Walmart.LC.Daily;

import java.util.Stack;

//71. Simplify Path
public class Simplify_Path {

    public static void main(String[] args) {
        Simplify_Path simplify_path = new Simplify_Path();
        String res = simplify_path.simplifyPath("/abc/test/../c");
        System.out.println("The res is: "+ res);
    }

    public String simplifyPath(String path) {
        String res = "/";
        Stack<String> stack = new Stack<>();
        String[] s = path.split("/");
        for(int i=0; i<s.length; i++){
            String curr = s[i];
            if(curr.length()==0 || curr.equals(".")){
                continue;
            }
            if(curr.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(curr);
            }
        }
        while(!stack.isEmpty()){
            res = "/" + stack.pop() + res;
        }
        return res.length() == 1 ? res : res.substring(0, res.length()-1);
    }
}
