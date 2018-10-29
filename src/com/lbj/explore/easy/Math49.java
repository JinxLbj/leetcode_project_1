/**
 * createby : lbj
 * date : 2018/7/31
 * desc :
 **/

package com.lbj.explore.easy;

import java.util.*;

public class Math49 {

    public static void main(String[] args) {
        System.out.println(new Math49().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }
        return nums[0] == 0 ? len : 0;
    }

    public int missingNumber1(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int length = nums.length;

        int[] newNums = new int[length + 1];

        for(int num : nums) {
            newNums[num] = 1;
        }

        for(int i = 0; i < newNums.length; i++) {
            if(newNums[i] == 0) {
                return i;
            }
        }

        return 0;
    }
}
