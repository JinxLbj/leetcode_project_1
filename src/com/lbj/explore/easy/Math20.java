/**
 * createby : lbj
 * date : 2018/7/24
 * desc :
 **/

package com.lbj.explore.easy;

public class Math20 {

    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"a"}));
        System.out.println(new Math20().longestCommonPrefix1(new String[]{"flower"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = "";
        String first = strs[0];
        if (first.length() == 0) {
            return "";
        }
        int index = 1;
        out:
        while (true) {
            String firstString = first.substring(0, index);
            inner:
            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].startsWith(firstString)) {
                    break out;
                }
            }
            index++;
            result = firstString;
            if (index > first.length()) {
                break;
            }
        }

        return result;
    }

    //第一方法
    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }

        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(str1)) {
                return false;
            }

        }

        return true;
    }

}
