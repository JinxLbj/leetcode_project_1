/**
 * createby : lbj
 * date : 2018/7/24
 * desc :
 **/

package com.lbj.explore.easy;

import com.lbj.entity.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Math25 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        listNode.next = listNode1;
        System.out.println(isPalindrome(listNode));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        list.add(head.val);
        ListNode listNode = head;
        while (listNode.next != null) {
            listNode = listNode.next;
            list.add(listNode.val);
        }
        int length = list.size();
        for (int i = 0; i < length / 2; i++) {
            if (!list.get(i).equals(list.get(length - i - 1))){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome1(ListNode head) {
        if (head == null){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        list.add(head.val);
        ListNode listNode = head;
        while (listNode.next != null) {
            listNode = listNode.next;
            list.add(listNode.val);
        }
        int length = list.size();
        for (int i = 0; i < length / 2; i++) {
            if (!list.get(i).equals(list.get(length - i - 1))){
                return false;
            }
        }
        return true;
    }

}
