/**
 * createby : lbj
 * date : 2018/7/30
 * desc :
 **/

package com.lbj.explore.easy;

public class Math37 {

    public static void main(String[] args) {
        System.out.println(new Math37().rob(new int[]{1, 1}));

    }

    public int rob(int[] nums) {

        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        int max = 0;
        int beforeResult = 0;
        for (int i = 0; i < len; i++) {
            int t = max;
            max = Math.max(max, beforeResult + nums[i]);
            beforeResult = t;
        }
        return max;

    }
}
