/**
 * createby : lbj
 * date : 2018/7/25
 * desc :
 **/

package com.lbj.explore.easy;

import com.lbj.entity.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Math27 {

    public static void main(String[] args) {
        System.out.println(maxDepth(new TreeNode(0)));
    }

    private static int deep = 1;

    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left != null || root.right != null){
            addTreeNode(root, 2);
        }
        return deep;
    }

    public static void addTreeNode(TreeNode root, int floor) {
        if (root.left != null || root.right != null) {
            if (root.left != null) {
                if(deep < floor){
                    deep ++;
                }
                addTreeNode(root.left,floor + 1);
            }
            if (root.right != null){
                if(deep < floor){
                    deep ++;
                }
                addTreeNode(root.right, floor + 1);
            }
        }
    }


    public int maxDepth1(TreeNode root) {
        // return 0 for null node
        if (root == null)
            return 0;
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        // return depth of the subtree rooted at root
        return Math.max(left_depth, right_depth) + 1;
    }
}
