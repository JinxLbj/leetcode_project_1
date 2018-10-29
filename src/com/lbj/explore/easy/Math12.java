/**
 * createby : lbj
 * date : 2018/7/23
 * desc :
 **/

package com.lbj.explore.easy;

public class Math12 {

    public static void main(String[] args) {
        String newString = reverseString("hello");
        System.out.println(newString);
    }

    //String转化为bytes数组
//    public static String reverseString(String s) {
//        byte[] bytes = s.getBytes();
//        int length = bytes.length;
//        for (int i = 0; i < length / 2; i++) {
//            byte t = bytes[i];
//            bytes[i] = bytes[length - 1 - i];
//            bytes[length - 1 - i] = t;
//        }
//        return new String(bytes);
//    }

    //String转化为char数组（速度快）
    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            char t = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = t;
        }
        return new String(chars);
    }


}
