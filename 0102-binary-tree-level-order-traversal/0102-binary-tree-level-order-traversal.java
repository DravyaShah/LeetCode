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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a=new ArrayList<>();

        if(root==null)
        {
            return a;
        }

        int level=height(root);

        for(int i=1;i<=level;i++)
        {
            List<Integer> currlevel=new ArrayList<Integer>();
            res(root,i,currlevel);
            a.add(currlevel);
        }
        return a;
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

    private void res(TreeNode root, int level, List<Integer> currlevel)
    {
        if(root==null)
        {
            return;
        }

        if(level==1)
        {
            currlevel.add(root.val);
            return;
        }

        res(root.left, level-1, currlevel);
        res(root.right, level-1, currlevel);
    }
}