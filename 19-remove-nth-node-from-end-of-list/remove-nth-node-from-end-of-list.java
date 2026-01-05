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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode dummy_pointer = head;

        while (dummy_pointer != null) {
            size++;
            dummy_pointer = dummy_pointer.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;
        int count = 0;

        while(current != null && count < size - n){
            current = current.next;
            count++;
        }
        current.next = current.next.next;
        return dummy.next;
    }
}