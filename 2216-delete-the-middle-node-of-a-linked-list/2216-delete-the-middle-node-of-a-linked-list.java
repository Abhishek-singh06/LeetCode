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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null)
    return null;
        ListNode curr = head;
        int c = 0;
        while (curr != null) {
            curr = curr.next;
            c++;
        }
        int l = c / 2;
        ListNode prev = head;
     int p=0;
       while(prev!=null && prev.next!=null)
       {
           if(p!=l-1)
           {
            prev=prev.next;
        
           }
           else
           {
            prev.next=prev.next.next;
           }
           p++;
       }
        return head;
    }
}