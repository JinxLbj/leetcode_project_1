/**
 * createby : lbj
 * date : 2018/7/31
 * desc :
 **/

package com.lbj.explore.easy;

import java.util.Stack;

public class Math48 {

    public static void main(String[] args) {
        System.out.println(new Math48().isValid("()[]{}"));
    }

    public boolean isValid(String s) {
        if(s.length() == 0){
            return true;
        }
        int small = 0;
        int normal = 0;
        int big = 0;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if(chars[i] == 40){
                small++;
                stack.push('(');
            }else if(chars[i] == 41){
                if(small == 0){
                    return false;
                }
                if(stack.pop() != '('){
                    return false;
                }
                small--;
            }else if(chars[i] == 91){
                normal++;
                stack.push('[');
            }else if(chars[i] == 93){
                if(normal == 0){
                    return false;
                }
                if(stack.pop() != '['){
                    return false;
                }
                normal--;
            }else if(chars[i] == 123){
                big++;
                stack.push('{');
            }else if(chars[i] == 125){
                if(big == 0){
                    return false;
                }
                if(stack.pop() != '{'){
                    return false;
                }
                big--;
            }
        }

        return small == 0 && normal == 0 && big == 0;
    }

}
