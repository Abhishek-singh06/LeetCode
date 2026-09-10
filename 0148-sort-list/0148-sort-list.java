class Solution {
public ListNode sortList(ListNode head) {
    if(head==null || head.next==null)
    return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
       ListNode  second=slow.next;
        slow.next=null;
         
        ListNode  left=sortList(head);
        ListNode  right=sortList(second);
        return merge(left,right);
           
    }
    public ListNode  merge(ListNode  left,ListNode  right)
    {
        ListNode curr=new ListNode(0);
        ListNode temp=curr;
        while(left!=null && right!=null)
        {
            if(left.val>right.val)
            {
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
            else
            {
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }

        }
        while(left!=null)
        {
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        while(right!=null)
        {
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        return curr.next;
    }
}