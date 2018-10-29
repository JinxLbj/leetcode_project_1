/**
 * createby : lbj
 * date : 2018/7/30
 * desc :
 **/

package com.lbj.explore.easy;

public class Math39 {

    private Node head;
//    private int[] ints = new int[]{};

    public static void main(String[] args) {
        Math39 m = new Math39();
        m.push(-1);
        m.pop();
        m.push(2);
        System.out.println(m.top());
    }

    public Math39() {

    }

    //    public void push(int x) {
//        int len = ints.length;
//        int[] copy = new int[len + 1];
//        System.arraycopy(ints, 0, copy, 1, len);
//        copy[0] = x;
//        ints = copy;
//    }
//
//    public void pop() {
//        int len = ints.length;
//        int[] copy = new int[len - 1];
//        System.arraycopy(ints, 1, copy, 0, len - 1);
//        ints = copy;
//    }
//
//    public int top() {
//        if (ints.length != 0) {
//            return ints[0];
//        }
//        return 0;
//    }
//
//    public int getMin() {
//        int len = ints.length;
//        if(len == 0){
//            return 0;
//        }else if(len == 1){
//            return ints[0];
//        }
//        int[] copy = new int[len];
//        System.arraycopy(ints, 0, copy, 0, len);
//        Arrays.sort(copy);
//        return copy[0];
//    }

    //用链表实现
    public void push(int x) {
        if (head == null) {
            head = new Node(x, x);
        } else {
            head = new Node(x, Math.min(x, head.min), head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    class Node {
        private int val;
        private int min;
        private Node next;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

}
