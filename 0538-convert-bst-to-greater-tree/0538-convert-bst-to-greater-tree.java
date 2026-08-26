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
    public TreeNode convertBST(TreeNode root) {
        if(root==null)
        {
            return null;
        }

        gst(root,0);

        return root;
    }

    private int gst(TreeNode root, int sum)
    {
        if(root==null)
        {
            return sum;
        }

        sum=gst(root.right,sum);

        sum=sum+root.val;
        root.val=sum;

        sum=gst(root.left,sum);

        return sum;
    }
}