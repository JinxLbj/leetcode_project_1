/**
 * createby : lbj
 * date : 2018/7/24
 * desc :
 **/

package com.lbj.explore.easy;

import com.lbj.entity.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Math22 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(9);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(ListNode.showList(listNode));
        removeNthFromEnd(listNode, 2);
        System.out.println(ListNode.showList(listNode));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = head;
        List<ListNode> listNodes = new ArrayList<>();
        listNodes.add(head);
        while(listNode.next != null){
            listNode = listNode.next;
            listNodes.add(listNode);
        }
        int index = listNodes.size() - n - 1;
        if(index == -1){
            head = head.next;
        }else{
            ListNode listNode1 = listNodes.get(index);
            listNode1.next = listNode1.next.next;
        }
        return head;
    }

    //网络方法
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if (n == 0) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy, cur = dummy;
        while( n >= 0 && cur != null) {
            cur = cur.next;
            n --;
        }
        while (cur != null) {
            pre = pre.next;
            cur = cur.next;
        }

        pre.next = pre.next.next;

        return dummy.next;
    }

}
