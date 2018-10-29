/**
 * createby : lbj
 * date : 2018/7/27
 * desc :
 **/

package com.lbj.explore.easy;

public class Math36 {

    public static void main(String[] args) {
        System.out.println(new Math36().maxSubArray(new int[]{1,2}));

    }


    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
