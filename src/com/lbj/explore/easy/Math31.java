/**
 * createby : lbj
 * date : 2018/7/26
 * desc :
 **/

package com.lbj.explore.easy;

import com.lbj.entity.TreeNode;

public class Math31 {

    public static void main(String[] args) {

        TreeNode root = new Math31().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        System.out.println(root);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        int length = nums.length;
        int[] leftNums = null;
        int[] rightNums = null;
        TreeNode root = null;
        if (length % 2 == 0) {
            leftNums = new int[length / 2];
            rightNums = new int[length / 2 - 1];
            System.arraycopy(nums, 0, leftNums, 0, length / 2);
            System.arraycopy(nums, length / 2 + 1, rightNums, 0, length / 2 - 1);
            root = new TreeNode(nums[length / 2]);
        } else {
            leftNums = new int[length / 2];
            rightNums = new int[length / 2];
            System.arraycopy(nums, 0, leftNums, 0, length / 2);
            System.arraycopy(nums, length / 2 + 1, rightNums, 0, length / 2);
            root = new TreeNode(nums[length / 2]);
        }
        if (leftNums.length != 0) {
            root.left = sortedArrayToBST(leftNums);
        }
        if (rightNums.length != 0) {
            root.right = sortedArrayToBST(rightNums);
        }

        return root;
    }

    //网上方法。理念相同，速度快
    public TreeNode sortedArrayToBST1(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        return createNode(nums, 0, nums.length - 1);
    }

    private TreeNode createNode(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int middle = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = createNode(nums, l, middle - 1);
        root.right = createNode(nums, middle + 1, r);
        return root;
    }
}
