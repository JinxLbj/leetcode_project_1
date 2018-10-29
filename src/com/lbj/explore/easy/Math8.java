/**
 * createby : lbj
 * date : 2018/7/20
 * desc :
 **/

package com.lbj.explore.easy;

public class Math8 {

    public static void main(String[] args) {
        new Math8().moveZeroes(new int[]{0,1,0,3,12});
    }

    //我的辣鸡方法
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for(int i = 0 ; i < length ; i++){
            if(nums[i] == 0){
                for(int j = i + 1 ; j < length ; j++){
                    int t = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = t;
                }
                i--;
                length--;
            }
        }
        System.out.println(nums.length);
    }

    //牛逼方法
    public void moveZeroes1(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                if( i != k){
                    nums[k] = nums[i];
                    nums[i] = 0;
                }
                k++;
            }
        }
    }
}
