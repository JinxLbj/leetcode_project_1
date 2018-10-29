/**
 * createby : JinxLbj
 * date : 2018/8/15
 * desc : 前K个高频元素
 **/

package com.lbj.explore.normal;

import java.lang.reflect.Array;
import java.util.*;

public class NormalMath22 {

    public static void main(String[] args) {
        System.out.println(new NormalMath22().topKFrequent(new int[]{1, 1, 1, 2, 2, 2, 3}, 2));
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                max = Math.max(value + 1, max);
                map.put(nums[i], value + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        ArrayList<Integer>[] arrayLists = new ArrayList[max + 1];
        for (Map.Entry<Integer, Integer> entry :
                map.entrySet()) {
            if (arrayLists[entry.getValue()] == null) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(entry.getKey());
                arrayLists[entry.getValue()] = list;
            } else {
                arrayLists[entry.getValue()].add(entry.getKey());
            }
        }

        for (int i = arrayLists.length - 1; i >= 0; i--) {
            if (arrayLists[i] != null) {
                result.addAll(arrayLists[i]);
            }
            if (result.size() >= k) {
                break;
            }
        }

        return result;
    }


}
