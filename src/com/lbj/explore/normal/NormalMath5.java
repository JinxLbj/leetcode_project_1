/**
 * createby : lbj
 * date : 2018/8/1
 * desc :
 **/

package com.lbj.explore.normal;

public class NormalMath5 {

    public static void main(String[] args) {
        new NormalMath5().longestPalindrome("babad");
    }

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        String result = "";
        StringBuilder stringBuilder = new StringBuilder("");
        int len = chars.length;
        int index1 = 1;
        int index2 = 1;
        for (int i = 0; i < len; i++) {
            stringBuilder.append(chars[i]);
            while (i - index1 >= 0 && chars[i - index1] == chars[i]) {
                stringBuilder.insert(0, chars[i - index1]);
                index1++;
            }
            while (i + index2 <= len - 1 && chars[i + index2] == chars[i]) {
                stringBuilder.append(chars[i + index2]);
                index2++;
            }
            while (i - index1 >= 0 && i + index2 <= len - 1) {
                if (chars[i - index1] == chars[i + index2]) {
                    stringBuilder.insert(0, chars[i - index1]);
                    stringBuilder.append(chars[i + index2]);
                    index1++;
                    index2++;
                } else {
                    break;
                }
            }
            index1 = 1;
            index2 = 1;
            int curLen = stringBuilder.length();
            if (curLen > result.length()) {
                result = stringBuilder.toString();


            }
            stringBuilder.delete(0, curLen);
        }

        return result;
    }

}
