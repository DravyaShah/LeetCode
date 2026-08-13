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
    public int countNodes(TreeNode root) {
        if(root==null)
        {
            return 0;
        }

        int c1=lh(root);
        int c2=rh(root);

        if(c1==c2)
        {
            return (int)(Math.pow(2,c1)-1);
        }

        int left=countNodes(root.left);
        int right=countNodes(root.right);

        return 1+left+right;
    }

    private int lh(TreeNode root)
    {
        int count=0;
        while(root != null)
        {
            count++;
            root=root.left;
        }
        return count;
    }

    private int rh(TreeNode root)
    {
        int count=0;
        while(root != null)
        {
            count++;
            root=root.right;
        }
        return count;
    }
}