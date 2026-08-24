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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);

        ListNode prev = dummy;
        ListNode curr = head;
        
        prev.next = curr; 

        while(curr != null){
            while(curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
            }
            if(prev.next != curr){
                prev.next = curr.next;
                curr = prev.next;
            }else{
                prev = prev.next;
                curr = prev.next;
            }
        }
        return dummy.next;
    }
}
// prev - From where the link starts (denotes the last unique element)
// curr - to find the duplicates (next unique element after prev )