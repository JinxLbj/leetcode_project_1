/**
 * createby : lbj
 * date : 2018/8/2
 * desc :
 **/

package com.lbj.explore.normal;

public class NormalMath6 {

    public static void main(String[] args) {
        System.out.println(new NormalMath6().increasingTriplet(new int[]{1,2,2,1}));
    }

    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        if (nums.length < 3) {
            return false;
        }
        for (int num : nums) {
            if (first > num) {
                first = num;
            } else if (first < num && second > num) {
                second = num;
            } else if (num > second) {
                return true;
            }
        }
        return false;

    }

}
