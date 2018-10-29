/**
 * createby : JinxLbj
 * date : 2018/8/9
 * desc : 二叉搜索树中第K小的元素
 **/

package com.lbj.explore.normal;

import com.lbj.entity.TreeNode;

import java.util.*;

public class NormalMath14 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(4);
//        TreeNode root3 = new TreeNode(1);
        TreeNode root4 = new TreeNode(2);
//        TreeNode root5 = new TreeNode(15);
//        TreeNode root6 = new TreeNode(7);
        root.left = root1;
        root.right = root2;
//        root1.left = root3;
        root1.right = root4;
//        root2.left = root5;
//        root2.right = root6;
        System.out.println(new NormalMath14().kthSmallest(root, 4));
    }

    //暴力算法
//    private LinkedList<Integer> linkedList = new LinkedList<>();
//
//    public int kthSmallest(TreeNode root, int k) {
//
//        if (root == null) {
//            return 0;
//        }
//        addTree(root);
//        Collections.sort(linkedList);
//
//        return linkedList.get(k - 1);
//
//    }
//
//    private void addTree(TreeNode root) {
//
//        if (root.left != null) {
//            addTree(root.left);
//        }
//
//        linkedList.add(root.val);
//
//        if (root.right != null) {
//            addTree(root.right);
//        }
//    }

    public int kthSmallest(TreeNode root, int k) {
        search(root, k);
        return result;
    }

    private int cur = 1;
    private int result = -1;
    private boolean flag = false;

    private int search(TreeNode root, int k) {

        if (root.left != null) {
            int val = search(root.left, k);
            if (flag) {
                return val;
            }
        }

        if (cur == k) {
            flag = true;
            return result = root.val;
        } else {
            cur++;
        }

        if (root.right != null) {
            return search(root.right, k);
        }

        return -1;
    }
}
