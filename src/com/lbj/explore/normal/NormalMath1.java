/**
 * createby : lbj
 * date : 2018/8/1
 * desc :
 **/

package com.lbj.explore.normal;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class NormalMath1 {

    public static void main(String[] args) {
        new NormalMath1().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }

    public List<List<Integer>> threeSum(int[] as) {
        List<List<Integer>> lli = new ArrayList<List<Integer>>();
        Arrays.sort(as);
        //筛选
        for (int k = 0; k < as.length; ++k) {
            if (as[k] > 0) break;
            if (k > 0 && as[k] == as[k - 1]) continue;
            int target = 0 - as[k];
            int i = k + 1, j = as.length - 1;
            while (i < j) {
                if (as[i] + as[j] == target) {
                    List<Integer> l = new ArrayList<>();
                    l.add(as[k]);
                    l.add(as[i]);
                    l.add(as[j]);
                    lli.add(l);
                    while (i < j && as[i] == as[i + 1]) {
                        ++i;
                    }
                    while (i < j && as[j] == as[j - 1]) {
                        --j;
                    }
                    ++i;
                    --j;
                } else if (as[i] + as[j] < target) {
                    ++i;
                } else {
                    --j;
                }
            }
        }
        return lli;
    }

}
