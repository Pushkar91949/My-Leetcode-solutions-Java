/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return(head);
        }
        int l = 1;
        ListNode cr = head;

        while(cr.next != null){
            l++;
            cr = cr.next;
        }
        k = k % l;

        if(k == 0){
            return head;
        }
        cr.next = head;
        ListNode new_tail = head;

        for(int i = 0;i < l - k -1;i++){
            new_tail = new_tail.next;
        }
        ListNode new_head = new_tail.next;
        new_tail.next = null;
        return new_head;
    }
} // Question link: https://leetcode.com/problems/rotate-list/description/
