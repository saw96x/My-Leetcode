package com.MyLeetCode;

import java.util.List;

/**
 * @author Saw96x
 * @date 2020/8/20 - 21:41
 */
public class removeNthFromEnd_19 {
    //给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

    //链表节点的定义
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        //实际上就是删除lengh-n+1位置的节点，所以通过第一次扫描来获取length
        //第二次扫描移动指针，然后删除即可
        //哑节点的使用需要理解orz
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode movement = head;
        if (movement != null) {
            movement = movement.next;
            length++;
        }
        length -= n;
        movement = dummy;
        while (length != 0) {
            length--;
            movement = movement.next;
        }
        movement.next = movement.next.next;
        return dummy.next;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        //设置两个指针，第一个指针先移动到第二个指针前面n+1个节点处
        //然后同时移动两个指针，当第一个指针达到链表末尾，第二个指针也就达到了要删除节点的前一个
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
