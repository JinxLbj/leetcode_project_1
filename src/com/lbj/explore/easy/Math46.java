/**
 * createby : lbj
 * date : 2018/7/31
 * desc :
 **/

package com.lbj.explore.easy;

public class Math46 {

    public static void main(String[] args) {
        System.out.println(new Math46().reverseBits(1));
    }

    public int reverseBits(int n) {

//        char[] chars = Integer.toBinaryString(n).toCharArray();
//        int len = chars.length;
//        char[] newchars = new char[]{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'};
//        int newLen = newchars.length;
//        for (int i = 0; i < len; i++) {
//            newchars[newLen - 1 - i] = chars[len - 1 - i];
//        }
//        for (int i = 0; i < newLen / 2; i++) {
//            char t = newchars[i];
//            newchars[i] = newchars[newLen - 1 - i];
//            newchars[newLen - 1 - i] = t;
//        }
//        String s = new String(newchars);
//        BigInteger bi = new BigInteger(s, 2);
//        return Integer.parseInt(bi.toString());
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            if ((n & 1) == 1)
                ans++;
            n >>= 1;
        }
        return ans;
    }

    //网上方法
    public int reverseBits1(int n) {
        int result = 0;
        int i = 0;
        while (i < 32) {
            int temp = n & 0x01;
            n = n >> 1;

            result = (result << 1) | temp;
            i++;
        }
        return result;
    }

}
