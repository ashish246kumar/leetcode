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
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode temp,prev,after;
        prev=head;
        temp=head.next;
        head.next=null;
        while(temp!=null)
        {
            after=temp.next;
            temp.next=prev;
            prev=temp;
            temp=after;
        }
        return prev;
    }
}