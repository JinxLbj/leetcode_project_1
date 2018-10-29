/**
 * createby : lbj
 * date : 2018/8/3
 * desc :
 **/

package com.lbj.explore.normal;

import com.lbj.entity.ListNode;

import java.util.List;

public class NormalMath9 {

    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        while (cur1 != null) {
            lenA++;
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            lenB++;
            cur2 = cur2.next;
        }
        if (lenA > lenB) {
            while (lenA != lenB) {
                headA = headA.next;
                lenA--;
            }
        } else {
            while (lenA != lenB) {
                headB = headB.next;
                lenB--;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;

    }
}
