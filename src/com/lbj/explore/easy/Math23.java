/**
 * createby : lbj
 * date : 2018/7/24
 * desc :
 **/

package com.lbj.explore.easy;

import com.lbj.entity.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Math23 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(9);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(ListNode.showList(listNode));
        reverseList(listNode);
        System.out.println(ListNode.showList(listNode));
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode listNode = head;
        List<ListNode> listNodes = new ArrayList<>();
        listNodes.add(head);
        while (listNode.next != null) {
            listNode = listNode.next;
            listNodes.add(listNode);
        }
        int length = listNodes.size();
        for (int i = 0; i < length / 2; i++) {
            ListNode listNode1 = listNodes.get(i);
            ListNode listNode2 = listNodes.get(length - 1 - i);
            ListNode t = new ListNode(listNode1.val);
            t.next = listNode1.next;
            listNode1.val = listNode2.val;
            listNode1.next = listNode2.next;
            listNode2.val = t.val;
            listNode2.next = t.next;
        }
        for (int i = 0; i < length; i++) {
            if(i+1 == length){
                listNodes.get(i).next = null;
            }else{
                listNodes.get(i).next = listNodes.get(i + 1);
            }
        }
        return head;

    }

    //较快方法
    public ListNode reverseList1(ListNode head) {
        ListNode pre = null;
        ListNode next = head;
        while (next != null){
            ListNode tmp = next.next;
            next.next = pre;
            pre = next;
            next = tmp;
        }
        return pre;
    }
}
