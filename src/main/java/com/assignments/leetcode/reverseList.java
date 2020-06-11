package com.assignments.leetcode;

public class reverseList {

    public ListNode getReverseList(ListNode head){

        if (head == null &&head.next == null) {
            return head;
        }

        ListNode reverseListHead = getReverseList(head.next);
        head.next = null;
        head.next.next = head;
        return reverseListHead;

    }
}
