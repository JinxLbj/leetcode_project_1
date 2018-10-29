/**
 * createby : lbj
 * date : 2018/7/19
 * desc :
 **/

package com.lbj.explore.easy;

public class Math5 {

    public static void main(String[] args) {

//        int[] nums = new int[]{2,2,1};
//        int length = nums.length;
//        while (true) {
//            int count = 0;
//            for (int i = 1; i < length; i++) {
//                if (nums[i] < nums[i - 1]) {
//                    int t = nums[i];
//                    nums[i] = nums[i - 1];
//                    nums[i - 1] = t;
//                    count++;
//                }
//            }
//            if (count == 0) {
//                break;
//            }
//        }
//        for (int i = 0; i < length ; i = i + 2) {
//            if( i == length - 1){
//                System.out.println(nums[i]);
//                break;
//            }
//            if (nums[i] != nums[i + 1]) {
//                System.out.println(nums[i]);
//                break;
//            }
//        }
        System.out.println(singleNumber(new int[]{3,4,3,4,1}));
    }

    public static int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
