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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1=l1;
        ListNode curr2=l2;
        int c1=0,c2=0;
        while(curr1!=null)
        {
            c1++;
            curr1=curr1.next;
        }

        while(curr2!=null)
        {
            c2++;
            curr2=curr2.next;
        }
        curr1=l1;
        curr2=l2;
        int a=Math.max(c1,c2);
        int carry=0;
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(a>0)
        {
            int p1=0;
            int p2=0;
            if(curr1!=null)
            {
                 p1=curr1.val;
                 curr1=curr1.next;
            }

            if(curr2!=null)
            {
                 p2=curr2.val;
                 curr2=curr2.next;
            }
            int add=p1+p2+carry;
            int digit=add%10;
             carry=add/10;
            ans.next=new ListNode(digit);
            ans=ans.next;
            a--;
        }
        if(carry>0)
        ans.next=new ListNode(carry);
    return dummy.next;
    }
    
}