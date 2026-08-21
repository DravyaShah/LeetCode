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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> b=new ArrayList<>();

        if(root==null)
        {
            return b;
        }

        int n=height(root);
        for(int i=1;i<=n;i++)
        {
            List<Integer> a=new ArrayList<>();
            lvl(root,i,a);
            b.add(a);
        }
        Collections.reverse(b);
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

    private void lvl(TreeNode root, int level, List<Integer> a)
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

        lvl(root.left,level-1,a);
        lvl(root.right,level-1,a);
    }
}