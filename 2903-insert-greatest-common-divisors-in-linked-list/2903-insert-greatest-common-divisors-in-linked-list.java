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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp= head;
        while(temp!=null && temp.next!=null)
        {
            ListNode n=temp.next;
          int  p=gcd(temp.val,temp.next.val);
            ListNode hero=new ListNode(p);
            temp.next=hero;
            hero.next=n;
            temp=n;
        }
        return head;
        
    }
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}