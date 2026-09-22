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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp != null)
        {
            count++;
            temp=temp.next;
        }

        if(count < 2)
        {
            return head;
        }

        ListNode slow=head;
        ListNode fast=head.next;
        head=fast;

        ListNode prev=null;

        while(slow != null && fast != null)
        {
            ListNode next=fast.next;

            fast.next=slow;
            slow.next=next;

            if(prev != null)
            {
                prev.next=fast;
            }

            prev=slow;
            slow=next;

            if (slow != null) 
            {
                fast = slow.next;
            } 
            else 
            {
                fast = null;
            }
        }
        return head;
    }
}