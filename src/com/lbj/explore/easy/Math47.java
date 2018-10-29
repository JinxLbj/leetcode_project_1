/**
 * createby : lbj
 * date : 2018/7/31
 * desc :
 **/

package com.lbj.explore.easy;

import java.util.ArrayList;
import java.util.List;

public class Math47 {
    public static void main(String[] args) {
        new Math47().generate(5);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            int index = 1;
            while (list.size() < i + 1) {
                if (list.size() == i) {
                    list.add(1);
                } else {
                    List<Integer> upList = lists.get(i - 1);
                    list.add(upList.get(index - 1) + upList.get(index));
                    index++;
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
