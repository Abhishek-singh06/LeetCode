class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        int c = 0;
        int val1 = 0;
        int val2 = 0;
        int p = 0;

        while (curr != null) {
            p++;
            curr = curr.next;
        }

        if (k == p - k + 1)
            return head;

        curr = head;

        while (curr != null) {
            c++;
            if (c == k) {
                val1 = curr.val;
            } else if (c == (p - k + 1)) {
                val2 = curr.val;
            }
            curr = curr.next;
        }

        c = 0;
        curr = head;
        int temp = val1;

        while (curr != null) {
            c++;

            if (c == k) {
                curr.val = val2;
            }

            if (c == (p - k + 1)) {
                curr.val = temp;
            }

            curr = curr.next;
        }

        return head;
    }
}