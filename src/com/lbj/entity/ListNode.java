/**
 * createby : lbj
 * date : 2018/7/24
 * desc :
 **/

package com.lbj.entity;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static String showList(ListNode head) {
        String result = head.val + ",";
        while (head.next != null) {
            head = head.next;
            result += head.val + ",";
        }
        return result.substring(0, result.length() - 1);
    }

    public static ListNode buildList(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        ListNode head = null;
        ListNode bef = null;
        ListNode cur = null;
        for (int num : nums) {
            if (head == null) {
                cur = new ListNode(num);
                head = cur;
            } else {
                cur = new ListNode(num);
                bef.next = cur;
            }
            bef = cur;
        }
        return head;
    }

}
