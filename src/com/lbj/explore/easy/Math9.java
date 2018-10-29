/**
 * createby : lbj
 * date : 2018/7/20
 * desc :
 **/

package com.lbj.explore.easy;

import java.util.HashMap;
import java.util.Map;

public class Math9 {

    public static void main(String[] args) {
        int[] result = new Math9().twoSum2(new int[]{3, 2, 4}, 6);
    }

    //我的智障方法
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[0];
        out : for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[]{i, j};
                    break out;
                }
            }
        }
        return result;
    }

    //较快方法
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
