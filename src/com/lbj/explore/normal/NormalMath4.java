/**
 * createby : lbj
 * date : 2018/8/1
 * desc :
 **/

package com.lbj.explore.normal;

public class NormalMath4 {

    public static void main(String[] args) {
        new NormalMath4().lengthOfLongestSubstring("pwwkew");
    }

    //    public int lengthOfLongestSubstring(String s) {
//        int len = s.length();
//        if (len == 0) {
//            return 0;
//        }
//        char[] chars = s.toCharArray();
//        int max = 0;
//        StringBuilder cur = new StringBuilder("");
//        int index = 0;
//        while (index != len) {
//            int repeatLocation = cur.indexOf(String.valueOf(chars[index]));
//            if (repeatLocation == -1) {
//                cur.append(chars[index]);
//                index++;
//            } else {
//                max = Math.max(cur.length(), max);
//                cur.delete(0,repeatLocation + 1);
//                cur.append(chars[index]);
//                index++;
//            }
//        }
//        max = Math.max(cur.length(), max);
//        return max;
//    }
    public int lengthOfLongestSubstring(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int[] position = new int[256];
        for (int k = 0; k < 256; ++k) {
            position[k] = -1;
        }
        int i = 0, j = 1, res = 1;
        position[str.charAt(i)] = 0;
        for (; j < str.length(); ++j) {

            if (position[str.charAt(j)] != -1 && position[str.charAt(j)] >= i) {
                i = position[str.charAt(j)] + 1;
            }
            position[str.charAt(j)] = j;
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
