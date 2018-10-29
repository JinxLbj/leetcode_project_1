/**
 * createby : JinxLbj
 * date : 2018/8/6
 * desc : 每个节点的右向指针
 **/

package com.lbj.explore.normal;

import com.lbj.entity.TreeLinkNode;

import java.util.ArrayList;
import java.util.List;

public class NormalMath13 {

    public static void main(String[] args) {
        TreeLinkNode linkNode = new TreeLinkNode(1);
        TreeLinkNode linkNode1 = new TreeLinkNode(2);
        TreeLinkNode linkNode2 = new TreeLinkNode(3);
        linkNode.left = linkNode1;
        linkNode.right = linkNode2;
        new NormalMath13().connect(linkNode);

    }

    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null){
            root.left.next = root.right;
            if(root.next != null){
                root.right.next = root.next.left;
            }
        }
        connect(root.left);
        connect(root.right);
    }

}
