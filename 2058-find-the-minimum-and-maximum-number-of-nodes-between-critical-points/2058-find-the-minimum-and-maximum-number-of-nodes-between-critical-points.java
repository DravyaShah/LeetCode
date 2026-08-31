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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp != null)
        {
            count++;
            temp=temp.next;
        }

        int a[]=new int[count];
        int b=0;

        while(head != null)
        {
            a[b]=head.val;
            b++;
            head=head.next;
        }

        int res[]=new int[2];
        if(count <= 2)
        {
            res[0]=-1;
            res[1]=-1;
            return res;
        }

        ArrayList<Integer> lis=new ArrayList<>();
        for(int i=1;i<count-1;i++)
        {
            if(a[i] > a[i-1] && a[i] > a[i+1])
            {
                lis.add(i+1);
            }
            if(a[i] < a[i-1] && a[i] < a[i+1])
            {
                lis.add(i+1);
            }
        }

        int x=Integer.MAX_VALUE;
        int y=Integer.MAX_VALUE;
        int len=lis.size();

        if(len < 2)
        {
            x=-1;
            y=-1;
        }
        
        if(len >= 2)
        {
            x = lis.get(len-1) - lis.get(0);
            for(int i=0;i<len-1;i++)
            {
                int val=lis.get(i+1)-lis.get(i);
                y=Math.min(y,val);
            }
        }

        res[0]=y;
        res[1]=x;

        return res;
    }
}