class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode temp = head;
        ListNode curr = head.next;
        ListNode prev = curr;

        while (curr != null && curr.next != null) {

            temp.next = temp.next.next;
            temp = temp.next;

            curr.next = curr.next.next;
            curr = curr.next;
        }

        temp.next = prev;

        return head;
    }
}