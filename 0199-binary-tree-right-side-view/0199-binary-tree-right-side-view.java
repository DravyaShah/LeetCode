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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> b=new ArrayList<>();

        if(root==null)
        {
            return b;
        }

        int level=height(root);
        for(int i=1;i<=level;i++)
        {
            List<Integer> a=new ArrayList<>();
            rs(root,i,a);
            Collections.reverse(a);

            b.add(a.get(0));
        }
        return b;
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

    private void rs(TreeNode root, int level, List<Integer> a)
    {
        if(root==null)
        {
            return;
        }

        if(level==1)
        {
            a.add(root.val);
            return;
        }

        rs(root.left,level-1,a);
        rs(root.right,level-1,a);
    }
}