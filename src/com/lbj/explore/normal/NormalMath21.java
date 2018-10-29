/**
 * createby : JinxLbj
 * date : 2018/8/14
 * desc : 颜色分类
 **/

package com.lbj.explore.normal;

public class NormalMath21 {

    public static void main(String[] args) {
        new NormalMath21().sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }

    public void sortColors(int[] nums) {
        int r = 0;
        int w = 0;
        int b = 0;
        for (int num : nums) {
            if (num == 0) {
                r++;
            } else if (num == 1) {
                w++;
            } else if (num == 2) {
                b++;
            }
        }
        int index = 0;
        while (r != 0) {
            nums[index] = 0;
            index++;
            r--;
        }
        while (w != 0) {
            nums[index] = 1;
            index++;
            w--;
        }
        while (b != 0) {
            nums[index] = 2;
            index++;
            b--;
        }
    }

    //网上方法 类似快速排序
    public void quicksort(int[] nums,int left ,int right){
        int partition = 1;
        int l = left;
        int r = right;
        int i = left;
        while(i<=r){
            if(nums[i]<partition){
                swap(nums,i,l++);
                i++;
            }else if(nums[i]>partition){
                swap(nums,i,r--);
            }else{
                i++;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
