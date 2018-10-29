/**
 * createby : JinxLbj
 * date : 2018/8/22
 * desc : 数组中的第K个最大元素
 **/

package com.lbj.explore.normal;

import java.util.Arrays;

public class NormalMath23 {

    public static void main(String[] args) {
        System.out.println(new NormalMath23().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
//        int index = 0;
//        int before = -1;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            if (nums[i] != before) {
//                index++;
//                before = nums[i];
//            }
//            if (index == k) {
//                break;
//            }
//        }
        return nums[nums.length - k];
    }

}
