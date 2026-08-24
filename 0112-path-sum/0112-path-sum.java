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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return false;
        }

        return ps(root,targetSum,0);
    }

    private boolean ps(TreeNode root, int targetSum, int s)
    {
        if(root==null)
        {
            return false;
        }

        s=s+root.val;

        if(root.left==null && root.right==null && s==targetSum)
        {
            return true;
        }

        boolean left = ps(root.left,targetSum,s);
        boolean right = ps(root.right,targetSum,s);

        return left || right;
    }
}