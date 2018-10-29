/**
 * createby : lbj
 * date : 2018/7/24
 * desc :
 **/

package com.lbj.explore.easy;

import com.lbj.entity.ListNode;
import org.w3c.dom.NodeList;

import java.util.HashSet;
import java.util.Set;

public class Math26 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
//        ListNode listNode2 = new ListNode(0);
//        ListNode listNode3 = new ListNode(-4);
        listNode.next = listNode1;
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode;
        System.out.println(hasCycle1(listNode));
    }

    public static boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode cur1 = head;
        ListNode cur2 = head;
        int index = 0;
        while(cur2.next != null && cur2.next.next != null){
            cur1 = cur1.next;
            cur2 = cur2.next.next;
            if(cur1 == cur2){
                return true;
            }
        }
        return false;
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode cur = head;
        set.add(head);
        int length = 1;
        while(cur.next != null){
            cur = cur.next;
            set.add(cur);
            length++;
            if(length != set.size()){
                return true;
            }
        }

        return false;
    }
}
