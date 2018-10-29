/**
 * createby : lbj
 * date : 2018/7/26
 * desc :
 **/

package com.lbj.explore.easy;

public class Math35 {

    public static void main(String[] args) {

        System.out.println(new Math35().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

//    public int maxProfit(int[] prices) {
//        int max = 0;
//        int length = prices.length;
//        for (int i = 0; i < length - 1; i++) {
//            for (int j = i; j < length; j++) {
//                int cur = prices[j] - prices[i];
//                if(cur > max){
//                    max = cur;
//                }
//            }
//        }
//        return max;
//    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int length = prices.length;
        if (length == 0 || length == 1) {
            return 0;
        }
        int index1 = 0;
        int index2 = 1;
        while (index1 < length - 1) {
            int cur = prices[index2] - prices[index1];
            if (cur > max) {
                max = cur;
            }
            index2++;
            if (index2 == length) {
                index1++;
                index2 = index1;
            }
        }
        return max;
    }

    //网上方法
    public int maxProfit1(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxGap = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - minPrice > maxGap) {
                maxGap = prices[i] - minPrice;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxGap;
    }

}
