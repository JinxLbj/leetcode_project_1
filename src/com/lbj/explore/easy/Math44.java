/**
 * createby : lbj
 * date : 2018/7/31
 * desc :
 **/

package com.lbj.explore.easy;

public class Math44 {

    public static void main(String[] args) {
        System.out.println(new Math44().hammingWeight(5));
    }

    public int hammingWeight(int n) {
        return (int) Integer.toBinaryString(n).chars().filter(c -> '1' == c).count();
    }

    //魔鬼方法
    public int hammingWeight1(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
