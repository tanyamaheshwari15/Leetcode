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
        if(head == null || head.next == null)
            return head;
        
        ListNode prev = head;
        ListNode currNode = head.next;
        ListNode before = null;

        head = currNode;
        ListNode next = currNode.next;

        currNode.next = prev; 
        prev.next = next;

        before = prev;
        prev = next;

        while(prev != null && prev.next !=null){

            currNode = prev.next;
            next = currNode.next;

            before.next = currNode;
            currNode.next = prev; 
            prev.next = next;

            before = prev;
            prev = next;
        }
        return head;
    }
}