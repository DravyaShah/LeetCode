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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        int m=postorder.length;

        if(n==0 || m==0)
        {
            return null;
        }

        int x=postorder[m-1];
        TreeNode a=new TreeNode(x);
        int b=0;

        for(int i=0;i<m;i++)
        {
            if(x==inorder[i])
            {
                b=i;
                break;
            }
        }

        int leftPostorder[]=Arrays.copyOfRange(postorder,0,b);
        int rightPostorder[]=Arrays.copyOfRange(postorder,b,m-1);

        int leftInorder[]=Arrays.copyOfRange(inorder,0,b);
        int rightInorder[]=Arrays.copyOfRange(inorder,b+1,n);

        a.left = buildTree(leftInorder, leftPostorder);
        a.right = buildTree(rightInorder, rightPostorder);

        return a;
    }
}