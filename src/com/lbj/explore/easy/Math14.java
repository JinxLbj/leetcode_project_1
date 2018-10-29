/**
 * createby : lbj
 * date : 2018/7/23
 * desc :
 **/

package com.lbj.explore.easy;

import java.util.Arrays;

public class Math14 {

    public static void main(String[] args) {
        int index = firstUniqChar("leetcode");
        System.out.println(index);
    }

    //宋方法
    public static int firstUniqChar(String s) {
        int result = -1;
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < chars.length ; i ++){
            int index = s.indexOf(chars[i]);
            if(index == s.lastIndexOf(chars[i])){
                result = result != -1?Math.min(result,index):index;
            }
        }
        return result;
    }

    //网络方法
    public int firstUniqChar1(String s) {
        int result = -1;
        for(char c = 'a';c<='z';c++){
            int index = s.indexOf(c);
            if(index != -1 && index == s.lastIndexOf(c)){
                result = result != -1?Math.min(result,index):index;
            }
        }
        return result;
    }

}
