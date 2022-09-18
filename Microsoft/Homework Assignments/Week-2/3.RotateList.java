class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head, temp = head;
        int nodeLength = 1;

        if (head == null) return head;

        while (tail.next != null) {
            tail = tail.next;
            nodeLength++;
        }

        k = nodeLength - (k % nodeLength);
        if (k == 0) return head;

        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        tail.next = head;
        head = temp.next;
        temp.next = null;

        return head;
    }
}
/*
Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]   */
