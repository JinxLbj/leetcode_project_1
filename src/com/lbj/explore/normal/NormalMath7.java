/**
 * createby : lbj
 * date : 2018/8/3
 * desc :
 **/

package com.lbj.explore.normal;

import com.lbj.entity.ListNode;

public class NormalMath7 {

    public static void main(String[] args) {
        new NormalMath7().addTwoNumbers(ListNode.buildList(new int[]{1}),
                ListNode.buildList(new int[]{9, 9}));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addNext = 0;
        ListNode head = null;
        ListNode l3;
        ListNode before = null;
        while (l1 != null || l2 != null) {
            if (before != null) {
                l3 = new ListNode(addNext);
                before.next = l3;
            } else {
                l3 = new ListNode(addNext);
                head = l3;
            }
            if (l1 != null) {
                l3.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                l3.val += l2.val;
                l2 = l2.next;
            }
            addNext = 0;
            int a = l3.val / 10;
            if (a == 1) {
                addNext = 1;
                l3.val = l3.val % 10;
            }
            before = l3;
        }
        if (addNext != 0) {
            before.next = new ListNode(1);
        }
        return head;
    }
}
