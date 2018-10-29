/**
 * createby : lbj
 * date : 2018/7/25
 * desc :
 **/

package com.lbj.explore.easy;

import com.lbj.entity.TreeNode;

public class Math28 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(15);
        TreeNode t3 = new TreeNode(6);
        TreeNode t4 = new TreeNode(20);
        root.left = t1;
        root.right = t2;
        t2.left = t3;
        t2.right = t4;
//        System.out.println(isValidBST(root));
    }

    //我自己写不出来
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean valid(TreeNode root, long low, long high) {
        if (root == null) return true;
        if (root.val <= low || root.val >= high) return false;
        return valid(root.left, low, root.val) && valid(root.right, root.val, high);
    }

}
