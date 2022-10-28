class Solution {
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        // finding mid value
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;       //slow moves one step
            fast=fast.next.next;  // fast moves two steps
        }
        ListNode mid=slow;     //slow or mid is same 
        // reversing the list after finding mid 
        ListNode prev=null,curr=slow,temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
         // merge 2 list
        ListNode first=head,second=prev;   // renaming 
        while(second.next!=null){
            temp=first.next;
            first.next=second;
            first=temp;
            temp=second.next;
            second.next=first;
            second=temp;
        }
    }
}
/*    Formula: 
The list can be represented as:
L0 → L1 → … → Ln - 1 → Ln

Reorder the list to be on the following form:
L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …

Example 1:
Input: head = [1,2,3,4]   -->  1->2->3->4
Output: [1,4,2,3]         -->  1->4->2->3

Example 2:
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
*/
