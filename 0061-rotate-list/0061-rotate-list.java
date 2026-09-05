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
        if(head==null || head.next==null || k==0)
        return head;
        ListNode curr=head;
        ListNode p=curr;
        int length=0;
        while(curr.next!=null)
        {
            curr=curr.next;
            length++;
        }
        length++;
        ListNode prev=head;
        ListNode t=prev;
        k=k%length;
        if(k==0)
        return head;
        
        for(int i=1;i<length-k;i++)
        {
            prev=prev.next;

        }
        ListNode broken=prev.next;
        prev.next=null;
        curr.next=head;
        return broken;
        
     
    }
}