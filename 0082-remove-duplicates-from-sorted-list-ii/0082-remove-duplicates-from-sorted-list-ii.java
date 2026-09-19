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

        if(head==null || head.next==null)
        {
            return head;
        }

        ListNode temp=head;
        ArrayList<Integer> a=new ArrayList<>();

        while(temp != null)
        {
            a.add(temp.val);
            temp=temp.next;
        }

        ArrayList<Integer> b=new ArrayList<>();
        if(a.get(0) != a.get(1))
        {
            b.add(a.get(0));
        }

        for(int i=1;i<a.size()-1;i++)
        {
            if(a.get(i) != a.get(i-1) && a.get(i) != a.get(i+1))
            {
                b.add(a.get(i));
            }
        }

        if(a.get(a.size()-1) != a.get(a.size()-2))
        {
            b.add(a.get(a.size()-1));
        }

        ListNode h1=new ListNode(0);
        ListNode h2=h1;
        for(int i=0;i<b.size();i++)
        {
            h2.next = new ListNode(b.get(i));
            h2=h2.next;
        }

        return h1.next;
    }
}