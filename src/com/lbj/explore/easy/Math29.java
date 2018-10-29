/**
 * createby : lbj
 * date : 2018/7/25
 * desc :
 **/

package com.lbj.explore.easy;

import com.lbj.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Math29 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(3);
//        TreeNode t4 = new TreeNode(4);
//        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(2);
        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t2.left = t6;
        System.out.println(new Math29().isSymmetric(root));
    }

    private List<TreeNodeDetail> treeNodes = new ArrayList<>();

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        addTree(root, "");
        int length = treeNodes.size();
        for (int i = 0; i < length / 2; i++) {
            if(treeNodes.get(i).treeNode.val != treeNodes.get(length - i - 1).treeNode.val){
                return false;
            }else{
                String a = treeNodes.get(i).location;
                String a1 = treeNodes.get(length - i - 1).location;
                if(a.length() != a1.length()){
                    return false;
                }
                char[] chars = a.toCharArray();
                char[] chars1 = a1.toCharArray();
                for(int j = 0 ; j < chars.length ; j++){
                    if((chars[j] ^ chars1[j]) == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void addTree(TreeNode root, String location){
        //左子树
        if (root.left != null) {
            addTree(root.left, location + "0");
        }
        //根节点
        treeNodes.add(new TreeNodeDetail(root, location));
        //右子树
        if (root.right != null) {
            addTree(root.right, location + "1");
        }
    }

    public class TreeNodeDetail{
        public TreeNode treeNode;
        public String location;
        public TreeNodeDetail(TreeNode treeNode, String location){
            this.treeNode = treeNode;
            this.location = location;
        }
    }



    //碉堡方法
    public boolean isSymmetric1(TreeNode root) {
        if(root==null) return true;
        return isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode l,TreeNode r) {
        if(l==null&&r==null) return true;
        if(l!=null&&r!=null){
            if(l.val!=r.val) return false;
            return isSymmetric(l.left,r.right)&&isSymmetric(r.left,l.right);
        }else return false;

    }
}
