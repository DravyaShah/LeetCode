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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;

        ListNode temp=new ListNode();
        ListNode t3=temp;
        int count=0;

        while(t1 != null)
        {
            if(count < a)
            {
                t3.next=new ListNode(t1.val);
                t3=t3.next;
                t1=t1.next;
                count++;
                continue;
            }
            else if(count==a)
            {
                while(t2 != null)
                {
                    t3.next=new ListNode(t2.val);
                    t3=t3.next;
                    t2=t2.next;
                }
                while(count<=b)
                {
                    t1=t1.next;
                    count++;
                }
                continue;
            }
            t3.next=new ListNode(t1.val);
            t3=t3.next;
            t1=t1.next;
            count++;
        }
        return temp.next;
    }
}