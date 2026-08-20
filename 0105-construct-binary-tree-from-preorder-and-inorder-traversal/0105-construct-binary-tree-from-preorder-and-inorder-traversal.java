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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        int m = inorder.length;

        if(n==0 || m==0)
        {
            return null;
        }

        int x=preorder[0];
        TreeNode a=new TreeNode(x);
        int b=0;
        int y = 0;
        for(int i=0;i<m;i++)
        {
            if(x==inorder[i])
            {
                b=i;
                break;
            }
        }

        int leftInorder[] = Arrays.copyOfRange(inorder,0,b);
        int rightInorder[] = Arrays.copyOfRange(inorder,b+1,m);

        int leftPreorder[] = Arrays.copyOfRange(preorder,1,1+b);
        int rightPreorder[] = Arrays.copyOfRange(preorder,1+b,n);

        a.left = buildTree(leftPreorder,leftInorder);
        a.right = buildTree(rightPreorder,rightInorder);

        return a;
    }
}