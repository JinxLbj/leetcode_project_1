/**
 * createby : JinxLbj
 * date : 2018/8/6
 * desc : 根据前序遍历与中序遍历生成二叉树
 **/

package com.lbj.explore.normal;

import com.lbj.entity.TreeNode;

import java.util.Arrays;
import java.util.List;

public class NormalMath12 {

    public static void main(String[] args) {

        new NormalMath12().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});

    }

    int location = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int index = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                index = i;
                location++;
                break;
            }
        }
        int[] left = new int[index];
        int[] right = new int[preorder.length - 1 - index];
        System.arraycopy(inorder, 0, left, 0, index);
        System.arraycopy(inorder, index + 1, right, 0, inorder.length - 1 - index);
        createTree(root, left, right, preorder);
        return root;
    }

    public void createTree(TreeNode root, int[] left, int[] right, int[] preorder) {
        if (left.length != 0) {
            int leftIndex = -1;
            for (int i = 0; i < left.length; i++) {
                if (preorder[location] == left[i]) {
                    leftIndex = i;
                    location++;
                    break;
                }
            }
            TreeNode leftNode = new TreeNode(left[leftIndex]);
            root.left = leftNode;
            int[] left1 = new int[leftIndex];
            int[] right1 = new int[left.length - 1 - leftIndex];
            System.arraycopy(left, 0, left1, 0, leftIndex);
            System.arraycopy(left, leftIndex + 1, right1, 0, left.length - 1 - leftIndex);
            createTree(leftNode, left1, right1, preorder);
        }

        if (right.length != 0) {
            int rightIndex = -1;
            for (int i = 0; i < right.length; i++) {
                if (preorder[location] == right[i]) {
                    rightIndex = i;
                    location++;
                    break;
                }
            }
            TreeNode rightNode = new TreeNode(right[rightIndex]);
            root.right = rightNode;
            int[] left2 = new int[rightIndex];
            int[] right2 = new int[right.length - 1 - rightIndex];
            System.arraycopy(right, 0, left2, 0, rightIndex);
            System.arraycopy(right, rightIndex + 1, right2, 0, right.length - 1 - rightIndex);
            createTree(rightNode, left2, right2, preorder);
        }


    }

}
