/**
 * createby : lbj
 * date : 2018/7/30
 * desc :
 **/

package com.lbj.explore.easy;

public class Math38 {

    int[] nums = new int[]{1, 2, 3};

    public static void main(String[] args) {
        System.out.println(new Math38().shuffle());
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }
    
    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int len = nums.length;
        int[] copy = new int[len];
        System.arraycopy(nums,0,copy,0,len);
        for (int j = 0; j < copy.length; j++) {
            int random = (int) (Math.random() * len);
            int t = copy[j];
            copy[j] = copy[random];
            copy[random] = t;
        }
        return copy;
    }

}
