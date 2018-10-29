/**
 * createby : lbj
 * date : 2018/7/26
 * desc :
 **/

package com.lbj.explore.easy;

import com.lbj.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Math30 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode t1 = new TreeNode(9);
        TreeNode t2 = new TreeNode(20);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(17);
        root.left = t1;
        root.right = t2;
        t2.left = t3;
        t2.right = t4;
        new Math30().levelOrder(root);

    }

    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return lists;
        }
        levelOrder1(root, 0);
        return lists;
    }

    public void levelOrder1(TreeNode root, int floor) {
        if(lists.size() <= floor){
            lists.add(new ArrayList<>());
        }
        List<Integer> list = lists.get(floor);
        list.add(root.val);
        if(root.left != null){
            levelOrder1(root.left, floor + 1);
        }
        if(root.right != null){
            levelOrder1(root.right, floor + 1);
        }
    }

}
