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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n=preorder.length;

        if(n==0)
        {
            return null;
        }

        TreeNode a=new TreeNode(preorder[0]);

        for(int i=1;i<n;i++)
        {
            insert(a,preorder[i]);
        }
        return a;
    }

    private void insert(TreeNode root, int val)
    {
        if (val < root.val) 
        {
            if (root.left == null) 
            {
                root.left = new TreeNode(val);
            } 
            else 
            {
                insert(root.left, val);
            }
        } 
        else 
        {
            if (root.right == null) 
            {
                root.right = new TreeNode(val);
            } 
            else 
            {
                insert(root.right, val);
            }
        }
    }
}