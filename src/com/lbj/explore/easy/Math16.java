/**
 * createby : lbj
 * date : 2018/7/23
 * desc :
 **/

package com.lbj.explore.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Math16 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }

    //傻吊方法
    public static boolean isPalindrome(String s) {
        String regEx ="[^a-zA-Z0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(s);
        s = m.replaceAll("").trim();
        String reverseString = reverseString(s);
        return s.toLowerCase().equals(reverseString.toLowerCase());
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            char t = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = t;
        }
        return new String(chars);
    }

    //网上方法（快）
    public boolean isPalindrome1(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while(start < end){
            while(start < end){
                char startc = chars[start];
                if(startc >= 'a' && startc <= 'z' || startc >= '0' && startc <= '9'){
                    break;
                }else{
                    start ++;
                }
            }
            while(start < end){
                char endc = chars[end];
                if(endc >= 'a' && endc <= 'z' || endc >= '0' && endc <= '9'){
                    break;
                }else{
                    end --;
                }
            }
            if(chars[start] != chars[end]){
                return false;
            }
            start ++ ;
            end -- ;
        }
        return true;
    }
}
