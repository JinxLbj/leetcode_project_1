/**
 * createby : lbj
 * date : 2018/7/31
 * desc :
 **/

package com.lbj.explore.easy;

public class Math45 {

    public static void main(String[] args) {
//        System.out.println(1 & 5);
        System.out.println(new Math45().hammingDistance(1,4));
    }

//    public int hammingDistance(int x, int y) {
//        int count = 0;
//        int n = x ^ y;
//        char[] chars = Integer.toBinaryString(n).toCharArray();
//        for(char c : chars){
//            if(c == '1'){
//                count++;
//            }
//        }
//        return count;
//    }

    public int hammingDistance(int x, int y) {
        int count = 0;
        int n = x ^ y;
        int copy = n;
        int mask = 1;
        for (int i = 0 ; i < 32 ; i++){
            if((mask & copy) == 1){
                count++;
            }
            copy = copy >> 1;
        }
        return count;
    }

}
