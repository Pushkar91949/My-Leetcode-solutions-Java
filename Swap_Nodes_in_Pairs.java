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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
    
        ListNode dummy = new ListNode(0);
        dummy.next = head.next;
        
        ListNode node = head;
        ListNode pre = null;
        
        while (node != null && node.next != null) {
            ListNode nx = node.next;
            node.next = nx.next;
            nx.next = node;

            if (pre != null) {
                pre.next = nx;
            }
          
            pre = node;
            
            node = node.next;
        }
        
        return dummy.next; 
    }
} // Question link: https://leetcode.com/problems/swap-nodes-in-pairs/
