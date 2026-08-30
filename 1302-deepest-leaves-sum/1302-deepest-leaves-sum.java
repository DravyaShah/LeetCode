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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)
        {
            return 0;
        }

        int n=height(root);

        return currlevel(root,n);
    }

    private int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=height(root.left);
        int right=height(root.right);

        return Math.max(left,right)+1;
    }

    private int currlevel(TreeNode root, int level)
    {
        if(root==null)
        {
            return 0;
        }

        if(level==1)
        {
            return root.val;
        }

        int ls = currlevel(root.left,level-1);
        int rs = currlevel(root.right,level-1);

        return ls + rs;
    }
}