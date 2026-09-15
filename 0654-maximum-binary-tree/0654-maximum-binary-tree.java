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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return tree(nums,0,nums.length-1);
    }

    private TreeNode tree(int nums[], int s,  int e)
    {
        if(s > e)
        {
            return null;
        }

        int m=Integer.MIN_VALUE;
        int a=0;
        for(int i=s;i<=e;i++)
        {
            if(nums[i] > m)
            {
                m=nums[i];
                a=i;
            }
        }

        TreeNode t=new TreeNode(m);

        t.left=tree(nums,s,a-1);
        t.right=tree(nums,a+1,e);

        return t;
    }
}