class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        // Empty list
        if (head == null) {
            return null;
        }
        ListNode cur = head, prev = null;
        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }
        ListNode con = prev, tail = cur;
        ListNode third = null;
        while (n > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            n--;
        }
        if (con != null) {
       
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
    }
}
/*
Example 1:
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]

Example 2:
Input: head = [5], left = 1, right = 1
Output: [5]  */
 

