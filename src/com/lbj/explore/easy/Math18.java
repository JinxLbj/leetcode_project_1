/**
 * createby : lbj
 * date : 2018/7/24
 * desc :
 **/

package com.lbj.explore.easy;

public class Math18 {

    public static void main(String[] args) {
        System.out.println(strStr("aaa", "aaaa"));
    }


    //自己的方法
    public static int strStr(String haystack, String needle) {
        if("".equals(needle)){
            return 0;
        }
        if("".equals(haystack)){
            return -1;
        }
        int index0 = 0;
        int index1 = 0;
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        int location = -1;

        while(true){

            if(haystackChars[index0] == needleChars[index1]){
                if(location == -1){
                    location = index0;
                }
                if(index1 == needleChars.length - 1){
                    return location;
                }
                index0++;
                if(index0 == haystackChars.length){
                    return -1;
                }
                index1++;
                continue;
            }else{
                if(location != -1){
                    index0 = location + 1;
                    index1 = 0;
                    location = -1;
                }else{
                    index0++;
                }
                if(index0 == haystackChars.length){
                    return -1;
                }
            }
        }
    }

    //可以总结成
    public int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }


}
