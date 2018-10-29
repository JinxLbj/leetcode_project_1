/**
 * createby : lbj
 * date : 2018/7/19
 * desc :
 **/

package com.lbj.explore.easy;

import java.util.ArrayList;
import java.util.List;

public class Math2 {

    public static void main(String[] args) {
        int[] ints = new int[]{7,1,5,3,6,4};
        int totalPrice = 0;
        for(int i = 1 ; i < ints.length ; i++){
            int now = ints[i] - ints[i - 1];
            if(now > 0)
                totalPrice += now;
        }
        System.out.println(totalPrice);
    }

    //尽量减少操作数量
    public static int maxProfit(int[] prices) {
        int sum=0;
        for(int i=0;i<prices.length;i++){
            int buyDate=i;
            while(i<prices.length-1&&prices[i] <= prices[i+1])
            {
                i++;
            }
            sum+=prices[i]-prices[buyDate];
        }
        return sum;
    }
}
