package com.MyLeetCode;

import java.util.HashSet;
import java.util.List;

/**
 * @author Saw96x
 * @date 2020/9/13 - 8:24
 */
public class hasCycle_141 {
    //给定一个链表，判断链表中是否有环。
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //双指针法
    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode slow = head, fast = head.next;
        //让快指针走的更快，没有环就会到达终点返回false，否则快慢指针必然相遇
        //返回true
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public boolean hasCycle2(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head))
                return true;
            else
                set.add(head);
            head = head.next;
        }
        return false;
    }
}
