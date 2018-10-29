/**
 * createby : lbj
 * date : 2018/7/24
 * desc :
 **/

package com.lbj.explore.easy;

public class Math19 {

    public static void main(String[] args) {
        System.out.println(countAndSay(3));
    }

    public static String countAndSay(int n) {
        char[] chars = new char[]{'1'};
        char nowChar;
        for (int i = 0; i < n - 1; i++) {
            nowChar = chars[0];
            int same = 0;
            String thisResult = "";
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == nowChar) {
                    same++;
                    if (j + 1 == chars.length) {
                        thisResult += same;
                        thisResult += nowChar;
                        same = 0;
                    }
                } else {
                    thisResult += same;
                    thisResult += nowChar;
                    nowChar = chars[j];
                    j = j - 1;
                    same = 0;
                }
            }
            chars = thisResult.toCharArray();
        }
        return new String(chars);

    }

    //网上的方法
    public String countAndSay1(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        String forward = countAndSay1(n - 1);
        int index = 0;
        while (index < forward.length()) {
            int cur = index;
            while (cur < forward.length() && forward.charAt(index) == forward.charAt(cur)) {
                cur++;
            }
            sb.append(cur - index).append(forward.charAt(index));
            index = cur;
        }
        return sb.toString();
    }
}
