/**
 * createby : lbj
 * date : 2018/8/3
 * desc :
 **/

package com.lbj.explore.normal;

import com.lbj.entity.ListNode;

public class NormalMath8 {

    public static void main(String[] args) {

        new NormalMath8().oddEvenList(ListNode.buildList(new int[]{1, 2, 3, 4, 5}));

    }

    public ListNode oddEvenList(ListNode head) {
        ListNode cur = head.next.next;
        int index = 1;
        ListNode befOdd = head;
        ListNode befEven = head.next;
        ListNode firstEven = null;
        while(cur != null){
            if(index % 2 != 0){
                befOdd.next = cur;
                befOdd = cur;
            }else{
                befEven.next = cur;
                befEven = cur;
            }
            index++;
            cur = cur.next;
        }
        return head;
    }


}
