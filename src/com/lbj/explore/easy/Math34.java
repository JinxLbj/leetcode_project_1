/**
 * createby : lbj
 * date : 2018/7/26
 * desc :
 **/

package com.lbj.explore.easy;

public class Math34 {

    public static void main(String[] args) {
        System.out.println(new Math34().climbStairs(5));

    }

    //山断了自己的腰
//    public int way = 0;
//
//    public int climbStairs(int n) {
//        TreeNode root = new TreeNode(n);
//        if (n - 1 >= 0) {
//            root.left = buildTree(n - 1);
//        }
//        if (n - 2 >= 0) {
//            root.right = buildTree(n - 2);
//        }
//        return way;
//    }
//
//    public TreeNode buildTree(int n) {
//        if(n == 0){
//            way++;
//        }
//        TreeNode root = new TreeNode(n);
//        if (n - 1 >= 0) {
//            root.left = buildTree(n - 1);
//        }
//        if (n - 2 >= 0) {
//            root.right = buildTree(n - 2);
//        }
//        return root;
//    }

    //斐波那契数列，使用递归速度较慢
    public int climbStairs1(int n) {
        if (n > 1) {
            return climbStairs1(n - 2) + climbStairs1(n - 1);
        } else {
            return 1;
        }
    }

    //节省空间
    public int climbStairs(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        int a[] = new int[]{1, 1};
        for (int i = 2; i < n + 1; i++) {
            int t = a[0];
            a[0] = a[1];
            a[1] = t;
            a[1] = a[0] + a[1];
        }

        return a[1];
    }
}
