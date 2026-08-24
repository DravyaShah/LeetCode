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
    public int sumNumbers(TreeNode root) {
        if(root==null)
        {
            return 0;
        }

        return sum(root,0);
    }

    private int sum(TreeNode root, int s)
    {
        if(root==null)
        {
            return 0; 
        }

        s = (s*10) + root.val;

        if(root.left==null && root.right==null)
        {
            return s;
        }

        int left = sum(root.left,s);
        int right = sum(root.right,s);

        return left+right;
    }
}