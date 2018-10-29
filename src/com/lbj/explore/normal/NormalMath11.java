/**
 * createby : JinxLbj
 * date : 2018/8/6
 * desc : 锯齿遍历二叉树
 **/

package com.lbj.explore.normal;

import com.lbj.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class NormalMath11 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(20);
        TreeNode root3 = new TreeNode(1);
        TreeNode root4 = new TreeNode(2);
        TreeNode root5 = new TreeNode(15);
        TreeNode root6 = new TreeNode(7);
        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.left = root5;
        root2.right = root6;
        new NormalMath11().zigzagLevelOrder(root);
    }

    private List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return lists;
        }
        addTree(root, 1);
        return lists;
    }

    public void addTree(TreeNode root, int floor) {
        List<Integer> list = null;
        if (lists.size() == floor - 1) {
            list = new ArrayList<Integer>();
            lists.add(list);
        } else {
            list = lists.get(floor - 1);
        }
        //如果是奇数层
        if (floor % 2 != 0) {
            list.add(root.val);
        } else {
            list.add(0, root.val);
        }
        if (root.left != null) {
            addTree(root.left, floor + 1);
        }
        if (root.right != null) {
            addTree(root.right, floor + 1);
        }
    }

}
