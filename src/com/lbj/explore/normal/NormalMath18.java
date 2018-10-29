/**
 * createby : JinxLbj
 * date : 2018/8/10
 * desc : 全排列
 **/

package com.lbj.explore.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NormalMath18 {

    public static void main(String[] args) {
        System.out.println(new NormalMath18().permute(new int[]{1, 2, 3}));
    }

    private List<List<Integer>> lists = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0){
            return lists;
        }
        arrange(nums, 0);
        System.out.println(lists.size());
        return lists;
    }

    private void arrange(int[] nums, int i) {
        if (i == nums.length - 1) {
            List<Integer> list = new LinkedList<>();
            for (int num : nums) {
                list.add(num);
            }
            lists.add(list);
        } else {
            for (int j = i; j < nums.length; j++) {
                exchange(nums, i, j);
                arrange(nums, i + 1);
                exchange(nums, i, j);
            }
        }
    }

    private void exchange(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
