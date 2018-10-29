/**
 * createby : lbj
 * date : 2018/8/5
 * desc :
 **/

package com.lbj.explore.normal;

import com.lbj.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class NormalMath10 {

    public static void main(String[] args) {

    }


//    public List<Integer> list = new ArrayList<>();

    //递归的方法（简单）
//
//    public List<Integer> inorderTraversal(TreeNode root) {
//
//        if(root == null){
//            return list;
//        }
//        addTree(root);
//
//        return list;
//    }
//
//    public void addTree(TreeNode root){
//
//        if(root.left != null){
//            addTree(root.left);
//        }
//        list.add(root.val);
//        if(root.right != null){
//            addTree(root.right);
//        }
//
//    }

    //迭代法
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.addFirst(root);
                root = root.left;
            }
            root = stack.removeFirst();
            list.add(root.val);
            root = root.right;
        }

        return list;
    }

}
