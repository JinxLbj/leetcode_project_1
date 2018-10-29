/**
 * createby : lbj
 * date : 2018/7/30
 * desc :
 **/

package com.lbj.explore.easy;

public class Math41 {

    public static void main(String[] args) {
        System.out.println(new Math41().countPrimes(10));
    }

//    private List<Integer> list = new ArrayList<>();

//    public int countPrimes(int n) {
//        if (n > 2) {
//            list.add(2);
//        }
//        for (int i = 3; i < n ; i++) {
//            boolean flag = true;
//            for (Integer aList : list) {
//                if(aList > Math.sqrt(n)){
//                    break;
//                }
//                if (i % aList == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                list.add(i);
//            }
//        }
//        return list.size();
//    }

    public int countPrimes(int n) {
        //不是质数的数量
        int count = 0;
        boolean[] booleans = new boolean[n];
        if(n <= 2){
            return 0;
        }
        //1不是质数
        count++;
        for (int i = 2; i * i < n; i++) {
            if (booleans[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                if(!booleans[j]){
                    booleans[j] = true;
                    count++;
                }

            }
        }
        return n - 1 - count;
    }

}
