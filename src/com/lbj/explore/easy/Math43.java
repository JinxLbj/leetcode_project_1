/**
 * createby : lbj
 * date : 2018/7/31
 * desc :
 **/

package com.lbj.explore.easy;

public class Math43 {

    public static void main(String[] args) {
        System.out.println(new Math43().romanToInt("MMMDCCLXIX"));
    }

    public int romanToInt(String s) {
        int result = 0;
        int before = 0;
        char[] chars = s.toCharArray();
        out : for (int i = 0; i < chars.length; i++) {
            if(i == chars.length - 1){
                switch (chars[i]){
                    case 'I':
                        result = result + 1;
                        break;
                    case 'V':
                        result = result + 5;
                        break;
                    case 'X':
                        result = result + 10;
                        break;
                    case 'L':
                        result = result + 50;
                        break;
                    case 'C':
                        result = result + 100;
                        break;
                    case 'D':
                        result = result + 500;
                        break;
                    case 'M':
                        result = result + 1000;
                        break;
                    default:
                        break;
                }
            }
            switch (chars[i]){
                case 'I':
                    if(before < 1){
                        result = result - before;
                    }else{
                        result = result + before;
                    }
                    before = 1;
                    continue out;
                case 'V':
                    if(before < 5){
                        result = result - before;
                    }else{
                        result = result + before;
                    }
                    before = 5;
                    continue out;
                case 'X':
                    if(before < 5){
                        result = result - before;
                    }else{
                        result = result + before;
                    }
                    before = 10;
                    continue out;
                case 'L':
                    if(before < 50){
                        result = result - before;
                    }else{
                        result = result + before;
                    }
                    before = 50;
                    continue out;
                case 'C':
                    if(before < 100){
                        result = result - before;
                    }else{
                        result = result + before;
                    }
                    before = 100;
                    continue out;
                case 'D':
                    if(before < 500){
                        result = result - before;
                    }else{
                        result = result + before;
                    }
                    before = 500;
                    continue out;
                case 'M':
                    if(before < 1000){
                        result = result - before;
                    }else{
                        result = result + before;
                    }
                    before = 1000;
                    continue out;
                default:
                    continue out;
            }
        }
        return result;
    }
}
