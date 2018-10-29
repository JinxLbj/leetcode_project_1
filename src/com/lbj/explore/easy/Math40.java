/**
 * createby : lbj
 * date : 2018/7/30
 * desc :
 **/

package com.lbj.explore.easy;

import java.util.ArrayList;
import java.util.List;

public class Math40 {

    public static void main(String[] args) {
        System.out.println(new Math40().fizzBuzz(15).size());
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean three = i % 3 == 0;
            boolean five = i % 5 == 0;
            if (five && three) {
                list.add("FizzBuzz");
            } else if (five) {
                list.add("Buzz");
            } else if (three) {
                list.add("Fizz");
            } else {
                list.add(i + "");
            }

        }
        return list;
    }
}
