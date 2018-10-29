/**
 * createby : lbj
 * date : 2018/7/20
 * desc :
 **/

package com.lbj.explore.easy;

public class Math7 {

    public static void main(String[] args) {
        int[] result = new Math7().plusOne(new int[]{9,9,9});
        System.out.println(result.length);
    }

    //自己的方法，递归
    public int[] plusOne(int[] digits){
        int length  = digits.length;
        return before(digits,length - 1);
    }

    private static int[] before(int[] digits, int index){
        if(digits[index] + 1 == 10){
            digits[index] = 0;
            if(index - 1 != -1){
                return before(digits, index - 1);
            }else{
                int[] longDigits = new int[digits.length + 1];
                longDigits[0] = 1;
                return longDigits;
            }
        }else{
            digits[index] += 1;
            return digits;
        }
    }

    //网上的方法
    public int[] plusOne1(int[] digits) {
        for(int i = digits.length-1; i >= 0 ; i--)
        {
            if(digits[i] < 9)
            {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] cur = new int[digits.length + 1];
        cur[0] = 1;
        return cur;

    }
}
