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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode before = null;
        for(int i = 1; i < left; i++){
            before = curr;
            curr = curr.next;
        }

        ListNode prev = null;
        for(int i = left; i <= right; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if(before != null){
            before.next.next = curr;
            before.next = prev;
        }
        else {
            head.next = curr;
            head = prev;
        }

        return head;
    }
}