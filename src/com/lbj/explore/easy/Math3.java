/**
 * createby : lbj
 * date : 2018/7/19
 * desc :
 **/

package com.lbj.explore.easy;

import java.util.ArrayList;
import java.util.List;

public class Math3 {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        int length = nums.length;
        k = k % length;
        int[] copynums = new int[nums.length];
        System.arraycopy(nums, 0, copynums, 0, length);
        for (int i = 0; i < length; i++) {
            if (i >= length - k) {
                nums[i - length + k] = copynums[i];
            } else {
                nums[i + k] = copynums[i];
            }
        }

        System.out.println(nums.length);
    }

    //牛逼方法
    public static void rotate(int[] nums, int k) {

        int n = nums.length - 1;
        k %= n + 1;
        reverse(nums, 0, n);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n);

    }

    private static void reverse(int[] nums, int start, int end) {
        while(start <= end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            ++ start;
            -- end;
        }
    }
}
