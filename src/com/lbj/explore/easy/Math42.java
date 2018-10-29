/**
 * createby : lbj
 * date : 2018/7/31
 * desc :
 **/

package com.lbj.explore.easy;

public class Math42 {

    public static void main(String[] args) {
        System.out.println(new Math42().isPowerOfThree(27));
    }

//    public boolean isPowerOfThree(int n) {
//        return Math.log10(n) / Math.log10(3) % 1 == 0;
//    }

//    public boolean isPowerOfThree(int n) {
//        if(n == 0){
//            return false;
//        }
//        return judge(n);
//    }
//
//    public boolean judge(int n){
//        if(n == 1){
//            return true;
//        }
//        if(n % 3 != 0){
//            return false;
//        }
//        return judge(n / 3);
//    }

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }
}
