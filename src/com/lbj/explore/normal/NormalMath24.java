/**
 * createby : JinxLbj
 * date : 2018/8/23
 * desc : 寻找峰值
 **/

package com.lbj.explore.normal;

public class NormalMath24 {

    public static void main(String[] args) {
        System.out.println(new NormalMath24().findPeakElement(new int[]{1, 2}));
    }

    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        if (len == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }
        int begin = 0;
        int end = len - 1;
        while (begin < end) {
            int mid = (begin + end) / 2;
            if (mid - 1 == -1) {
                if (nums[mid] > nums[mid + 1]) {
                    return mid;
                }
            } else if (mid + 1 == len) {
                if (nums[mid] > nums[mid - 1]) {
                    return mid;
                }
            } else {
                if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (nums[mid] < nums[mid + 1]) {
                    begin = mid + 1;
                } else if (nums[mid] > nums[mid + 1]) {
                    end = mid;
                }
            }
        }
        return begin;
    }


}
