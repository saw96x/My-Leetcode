package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/23 - 10:32
 */
public class mergeTwoLists_21 {
    //将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //双指针迭代法
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = (l1 == null) ? l2 : l1;
        return dummy.next;
    }

    //递归算法
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists2(l1.next,l2);  //对l1.next, l2为头节点的两个链表进行合并
            return l1;
        }else{
            l2.next = mergeTwoLists2(l2.next,l1); //对l2.next, l1为头节点的两个链表进行合并
            return l2;
        }
    }
}
