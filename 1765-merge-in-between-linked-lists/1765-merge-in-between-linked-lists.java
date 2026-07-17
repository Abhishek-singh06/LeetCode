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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode sp=list1;
        int c=0;
        ListNode sa=null;
        while(c<=b)
        {
             sp=sp.next;
             c++;
             sa=sp;
        }
        sp=list1;
        c=1;
        while(c<a)
        {
            sp=sp.next;
            c++;
        }
        ListNode curr=list2;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=sa;
        sp.next=list2;
        return list1;
        
    }
}