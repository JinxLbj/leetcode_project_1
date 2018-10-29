/**
 * createby : lbj
 * date : 2018/7/24
 * desc :
 **/

package com.lbj.explore.easy;

import com.lbj.entity.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Math24 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
//        ListNode listNode1 = new ListNode(2);
//        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(2);
//        ListNode listNode4 = new ListNode(3);
//        ListNode listNode5 = new ListNode(4);
//        listNode.next = listNode1;
//        listNode1.next = listNode2;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
        System.out.println(ListNode.showList(listNode));
        mergeTwoLists(listNode,listNode3);
        System.out.println(ListNode.showList(listNode));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        List<ListNode> listNodes1 = new ArrayList<>();
        ListNode listNode1 = l1;
        listNodes1.add(l1);
        while (listNode1.next != null) {
            listNode1 = listNode1.next;
            listNodes1.add(listNode1);
        }
        List<ListNode> listNodes2 = new ArrayList<>();
        ListNode listNode2 = l2;
        listNodes2.add(l2);
        while (listNode2.next != null) {
            listNode2 = listNode2.next;
            listNodes2.add(listNode2);
        }

        int index1 = 0;
        int index2 = 0;
        while (index2 != listNodes2.size()) {
            ListNode n1 = listNodes1.get(index1);
            ListNode n2 = listNodes2.get(index2);
            if (n1.val >= n2.val) {
                listNodes1.add(index1, n2);
                index1++;
                index2++;
            } else {
                if(index1 + 1 != listNodes1.size()){
                    index1++;
                }else{
                    listNodes1.add(n2);
                    index1++;
                    index2++;
                }
            }
        }
        for (int i = 0; i < listNodes1.size(); i++) {
            if (i + 1 == listNodes1.size()) {
                listNodes1.get(i).next = null;
            } else {
                listNodes1.get(i).next = listNodes1.get(i + 1);
            }
        }
        return listNodes1.get(0);
    }

    //递归法
    public ListNode mergeTwoLists1(ListNode l1,ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
