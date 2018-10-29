/**
 * createby : lbj
 * date : 2018/7/19
 * desc :
 **/

package com.lbj.explore.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Math4 {
    public static void main(String[] args) {
        int[] staffs = new int[]{1, 1, 2, 3, 4};
        boolean flag = false;
        for (int i = 0; i < staffs.length - 1; i++) {
            for (int j = i + 1; j < staffs.length; j++) {
                if (i == j) {
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
    }

    //更好方法，如果后一个数比前一个数大的话，则不需继续判断之前的数
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }
        for (int i = 1; i < nums.length; i++) {
            int b = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                int a = nums[j];
                if (a == b) {
                    return true;
                }
                if (b > a) {
                    break;
                }
            }
        }
        return false;
    }
}
