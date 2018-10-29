/**
 * createby : lbj
 * date : 2018/7/23
 * desc :
 **/

package com.lbj.explore.easy;

import java.math.BigDecimal;

public class Math17 {

    public static void main(String[] args) {
        System.out.println(myAtoi("words and 987"));

    }

    //自己的方法
    public static int myAtoi(String str) {
        boolean fushu = false;
        str = str.trim();
        char[] chars = str.toCharArray();
        char[] result = null;
        for (int i = 0; i < chars.length; i++) {
            //判断是否是数字
            if (chars[i] < '0' || chars[i] > '9') {
                //判断第一个字符是否是正负号
                if (chars[i] == '-' && i == 0) {
                    fushu = true;
                    continue;
                } else if (chars[i] == '+' && i == 0) {
                    continue;
                }
                result = new char[i];
                System.arraycopy(chars, 0, result, 0, i);
                return buildNum(new String(result), fushu);
            }
        }
        return buildNum(new String(str), fushu);
    }

    public static int buildNum(String str, boolean fushu) {
        if("".equals(str)){
            return 0;
        }else if("+".equals(str)){
            return 0;
        }else if("-".equals(str)){
            return 0;
        }
        int result = 0;
        try{
            result = Integer.valueOf(str);
        }catch (Exception e){
            if(fushu){
                return Integer.MIN_VALUE;
            }else{
                return Integer.MAX_VALUE;
            }
        }
        return result;
    }

    //网上方法
    public int myAtoi1(String str) {
        str = str.trim();

        long result = 0;
        int digits = 0;
        int negativeMark = 1;

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] < '0' || charArray[i] > '9') {
                if (i == 0 && charArray[0] == '-') {
                    negativeMark = -1;
                    continue;
                }
                if (i == 0 && charArray[0] == '+') {
                    continue;
                }
                break;
            }

            if (digits == 0 && charArray[i] == '0') {
                continue;
            }

            digits ++;
            if (digits > 12) {
                break;
            }

            result = result * 10 + (charArray[i] - '0');
        }

        result *= negativeMark;

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }

}
