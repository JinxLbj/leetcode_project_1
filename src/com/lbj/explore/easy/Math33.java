/**
 * createby : lbj
 * date : 2018/7/26
 * desc :
 **/

package com.lbj.explore.easy;

public class Math33 {

    private static int badVersion = 1702766719;

    public static void main(String[] args) {
        System.out.println(new Math33().firstBadVersion(2126753390));


    }

    public int firstBadVersion(int n) {
        if(n == 1){
            return 1;
        }
        long low = 0;
        long high = n;
        while (true) {
            int index = (int) ((low + high + 1) / 2);
            if(isBadVersion(index)){
                if(!isBadVersion(index - 1)){
                    return index;
                }else{
                    high = index;
                }
            }else{
                low = index;
            }

        }
    }

    boolean isBadVersion(int version) {
        if (version >= badVersion) {
            return true;
        }
        return false;
    }

    //网上方法，不是很理解
    public int firstBadVersion1(int n) {
        int left = 1;
        int right = n;
        int middle;

        while (left < right) {
            middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

}
