class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // 1. Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Split into two halves
        ListNode second = slow.next;
        slow.next = null;

        // 3. Reverse second half
        ListNode prev = null;
        ListNode curr = second;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        // 4. Merge
        ListNode first = head;
        second = prev;

        while (second != null) {

            ListNode temp = first.next;
            ListNode tempa = second.next;

            first.next = second;
            second.next = temp;

            first = temp;
            second = tempa;
        }
    }
}