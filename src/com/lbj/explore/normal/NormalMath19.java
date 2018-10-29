/**
 * createby : JinxLbj
 * date : 2018/8/14
 * desc : 子集
 **/

package com.lbj.explore.normal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NormalMath19 {

    public static void main(String[] args) {
        System.out.println(new NormalMath19().subsets(new int[]{1, 2, 3, 4}));
    }

    List<List<Integer>> lists = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {

        for (int i = 0; i <= nums.length; i++) {
            buildList(nums, i, 0, new LinkedList<>());
        }
        return lists;
    }

    private void buildList(int[] nums, int len, int location, List<Integer> temp) {
        if (len == 0) {
            List list = new LinkedList();
            list.addAll(temp);
            lists.add(list);
        } else {
            for (int i = location; i < nums.length; i++) {
                temp.add(nums[i]);
                buildList(nums, len - 1, i + 1, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    //网上方法
    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        list1.add(new ArrayList<Integer>());
        for(int num:nums){
            int size=list1.size(); //必须定义在内循环前
            for(int j=0;j<size;j++){
                List<Integer> temp = new ArrayList<>(list1.get(j));
                temp.add(num);
                list1.add(temp);
            }
        }
        return list1;
    }
}
