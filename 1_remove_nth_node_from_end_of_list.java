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
         if (head == null)
            return null;
    
        ListNode main = head;
        ListNode ref = head;
        for (int i = 1; i <= n; i = i + 1)
            main = main.next;
    
        if (main == null) 
        {
            ListNode temp = head.next;
            head.next = null;
            head = null;
            return temp;
        }
        
        while (main.next != null) 
        {
            main = main.next;
            ref = ref.next;
        }
        
        ListNode temp = ref.next;
        ref.next = temp.next;
        temp = null;
        return head;
    }
}