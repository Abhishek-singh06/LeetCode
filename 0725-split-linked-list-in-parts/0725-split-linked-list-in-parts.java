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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int c = 0;
        ListNode curr = head;

        while (curr != null) {
            c++;
            curr = curr.next;
        }

        curr = head;
        int d = c / k;
        int r = c % k;

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            if (r > 0) {
                arr[i] = d + 1;
                r--;
            } else {
                arr[i] = d;
            }
        }

        ListNode[] ans = new ListNode[k];
        int o = 0;
        ListNode temp = head;
        curr = head;

        while (o < k && curr != null) {

            ans[o] = temp;              // store start of current part

            for (int ca = 1; ca < arr[o]; ca++) {
                curr = curr.next;
            }

            ListNode copy = curr.next;
            curr.next = null;
            temp = copy;
            curr = copy;

            o++;
        }

        return ans;
    }
}