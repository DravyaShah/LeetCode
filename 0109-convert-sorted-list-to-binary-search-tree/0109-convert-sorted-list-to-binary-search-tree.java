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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp != null)
        {
            count++;
            temp=temp.next;
        }

        return bst(head,0,count);
    }

    private TreeNode bst(ListNode head, int start, int end)
    {
        if(start >= end)
        {
            return null;
        }

        int mid=start+(end-start)/2;

        ListNode temp=head;

        for(int i=start;i<mid;i++)
        {
            temp=temp.next;
        }

        TreeNode a=new TreeNode(temp.val);

        a.left=bst(head,start,mid);
        a.right=bst(temp.next,mid+1,end);

        return a;
    }
}