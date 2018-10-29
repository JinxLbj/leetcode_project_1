/**
 * createby : JinxLbj
 * date : 2018/8/10
 * desc : 生成括号
 **/

package com.lbj.explore.normal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NormalMath17 {

    public static void main(String[] args) {

        System.out.println(new NormalMath17().generateParenthesis(3));

    }

    private StringBuilder builder = new StringBuilder();
    private List<String> list = new LinkedList<>();
    private int num = -1;

    public List<String> generateParenthesis(int n) {
        if(n <= 0){
            return list;
        }
        num = n;
        builder.append("(");
        build(1, 0);
        return list;
    }

    private void build(int left, int right) {
        String before = builder.toString();
        if (left >= right && left < num) {
            builder.append("(");
            build(left + 1, right);
            if(before.length() + 1 == num * 2){
                list.add(builder.toString());
            }
            builder = new StringBuilder(before);
        }
        if (right < left) {
            builder.append(")");
            build(left, right + 1);
            if(before.length() + 1 == num * 2){
                list.add(builder.toString());
            }
            builder = new StringBuilder(before);
        }
    }

}
