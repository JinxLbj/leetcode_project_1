/**
 * createby : lbj
 * date : 2018/7/19
 * desc :
 **/

package com.lbj.explore.easy;

public class Math1 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 3, 5, 5};
        int length = nums.length;
        loop1:
        while (true) {
            int length2 = length;
            for (int i = 1; i < length; i++) {
                if (nums[i] == nums[i - 1]) {
                    System.arraycopy(nums, i + 1, nums, i, length2 - 1 - i);
                    length--;
                    continue loop1;
                }
            }
            break;
        }
        System.out.println(length);
    }

    //最快方法
    public static void fastestMethod(int[] nums) {
        int i = 0;
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] != nums[i]) {
                nums[++i] = nums[index];
            }
        }
        System.out.println(i + 1);
    }

}
