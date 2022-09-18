class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            ListNode nexxt=curr.next;
            if(prev==null){
                head=nexxt;       
            }
            else{
                prev.next=nexxt; 
            }
            
            curr.next=nexxt.next;
            nexxt.next=curr;
            
        
            prev=curr;    
            curr=curr.next;  
        }
        return head;
    }
}
/*
Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]

Example 2:
Input: head = []
Output: []

Example 3:
Input: head = [1]
Output: [1] 
*/
