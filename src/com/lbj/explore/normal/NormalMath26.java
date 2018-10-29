/**
 * createby : JinxLbj
 * date : 2018/8/24
 * desc : 合并区间
 **/

package com.lbj.explore.normal;

import com.lbj.entity.Interval;

import java.util.ArrayList;
import java.util.List;

public class NormalMath26 {


    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1, 4));
        list.add(new Interval(0, 1));
//        list.add(new Interval(8,10));
//        list.add(new Interval(15,18));
        new NormalMath26().merge(list);
    }

    public List<Interval> merge(List<Interval> intervals) {
        for (int i = 0; i < intervals.size() - 1; i++) {
            Interval cur = intervals.get(i);
            Interval next = intervals.get(i + 1);
            if (cur.start > next.start) {
                intervals.add(i, next);
                intervals.remove(i + 1);
                intervals.add(i + 1, cur);
                intervals.remove(i + 2);
            }
            cur = intervals.get(i);
            next = intervals.get(i + 1);
            if (cur.end >= next.start) {
                cur.end = Math.max(next.end, cur.end);
                intervals.remove(i + 1);
                i--;
            }
        }
        return intervals;
    }

}
