/**
 * createby : lbj
 * date : 2018/8/5
 * desc :
 **/

package com.lbj.test.data20180805;

import java.util.Arrays;
import java.util.List;

public class Exam2 {

    public static void main(String[] args) {
        System.out.println(new Exam2().numRescueBoats(new int[]{445,597,385,576,291,190,187,613,657,477}, 1000));
    }
    public int numRescueBoats(int[] people, int limit) {
        int len = people.length;
        if (len == 0) {
            return 0;
        }
        int result = 0;
        Arrays.sort(people);
        boolean[] exist = new boolean[len];
        for (int i = len - 1; i >= 0; i--) {
            if (exist[i]) {
                continue;
            }
            if (limit - people[i] > 0) {

                boolean twoMan = false;
                //寻找二分法
//                for (int m = i - 1; m >= 0; m--) {
//                    if (exist[m]) {
//                        continue;
//                    }
//                    if (people[m] + people[i] <= limit) {
//                        exist[m] = true;
//                        exist[i] = true;
//                        twoMan = true;
//                        result++;
//                        break;
//                    }
//                }
                int low = 0;
                int high = i - 1;
                int lastIndex = -1;
                while (low <= high) {
                    int theCenter = (low + high) / 2;
                    if (people[theCenter] + people[i] > limit) {
                        high = theCenter - 1;
                    } else if (people[theCenter] + people[i] < limit) {
                        if(!exist[theCenter]){
                            lastIndex = theCenter;
                            low = theCenter + 1;
                        }else{
                            high = theCenter - 1;
                        }
                    } else {
                        if(exist[theCenter]){
                            high = theCenter - 1;
                            continue;
                        }
                        exist[theCenter] = true;
                        exist[i] = true;
                        twoMan = true;
                        result++;
                        break;
                    }
                }
                if (lastIndex != -1) {
                    exist[lastIndex] = true;
                    exist[i] = true;
                    twoMan = true;
                    result++;
                }
                if (!twoMan) {
                    exist[i] = true;
                    result++;
                }

            } else {
                exist[i] = true;
                result++;
            }
        }
        return result;
    }
}
