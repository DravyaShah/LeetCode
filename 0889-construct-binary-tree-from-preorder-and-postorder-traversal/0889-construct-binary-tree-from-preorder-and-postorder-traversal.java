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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n=preorder.length;
        int m=postorder.length;

        if(n==0 || m==0)
        {
            return null;
        }

        TreeNode a=new TreeNode(preorder[0]);

        if(n==1)
        {
            return a;
        }

        int x=preorder[1];                           // finding left root

        int b=0;
        for(int i=0;i<m;i++)
        {
            if(x==postorder[i])
            {
                b=i;
                break;
            }
        }

        int leftsize = b+1;

        int postorderleft[]=Arrays.copyOfRange(postorder,0,leftsize);
        int postorderright[]=Arrays.copyOfRange(postorder,leftsize,m-1);

        int preorderleft[]=Arrays.copyOfRange(preorder,1,leftsize+1);
        int preorderright[]=Arrays.copyOfRange(preorder,leftsize+1,n);

        a.left = constructFromPrePost(preorderleft, postorderleft);
        a.right = constructFromPrePost(preorderright, postorderright);

        return a;
    }
}