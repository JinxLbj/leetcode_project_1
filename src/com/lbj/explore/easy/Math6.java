/**
 * createby : lbj
 * date : 2018/7/19
 * desc :
 **/

package com.lbj.explore.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Math6 {

    public static void main(String[] args) {

       new Math6().intersect(new int[]{1,2,2,1},new int[]{2,2});
        new Math6().intersect2(new int[]{1,2,2,1},new int[]{2,2});
    }

    //自己的方法，速度很慢
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = Arrays.stream( nums1 ).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        out : for(int i = 0 ; i < nums2.length ; i++){

            for(int j = 0 ; j < list.size() ; j++){

                if(nums2[i] == list.get(j)){
                    result.add(nums2[i]);
                    list.remove(j);
                    continue out;
                }
            }

        }

        int[] nums3 = new int[result.size()];
        for(int i = 0 ; i < nums3.length ; i ++){
            nums3[i] = result.get(i);
        }
        return nums3;
    }

    //最优解
    public int[] intersect2(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> tmp = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums2[j] > nums1[i]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                tmp.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[tmp.size()];
        for (int k = 0; k < result.length; k++) {
            result[k] = tmp.get(k);
        }
        return result;
    }
}
