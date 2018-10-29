/**
 * createby : JinxLbj
 * date : 2018/8/9
 * desc : 电话号码的字母组合
 **/

package com.lbj.explore.normal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NormalMath16 {

    public static void main(String[] args) {
        System.out.println(new NormalMath16().letterCombinations("234"));
    }

    private StringBuilder stringBuilder = new StringBuilder();
    private LinkedList<String> stringList = new LinkedList<>();
    private String[] nums = null;

    public List<String> letterCombinations(String digits) {
        if("".equals(digits)){
            return stringList;
        }
        String[][] strings = new String[][]{{"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"},
                {"j", "k", "l"},
                {"m", "n", "o"},
                {"p", "q", "r", "s"},
                {"t", "u", "v"},
                {"w", "x", "y", "z"}};

        nums = digits.split("");
        pick(strings, 0);
        return stringList;
    }

    private void pick(String[][] strings, int index) {
        for (int i = 0; i < strings[Integer.valueOf(nums[index]) - 2].length; i++) {
            StringBuilder before = new StringBuilder(stringBuilder.toString());
            stringBuilder.append(strings[Integer.valueOf(nums[index]) - 2][i]);
            if(stringBuilder.length() == nums.length){
                stringList.add(stringBuilder.toString());
                stringBuilder = before;
            }else{
                pick(strings, index + 1);
                stringBuilder = before;
            }
        }
    }

}
