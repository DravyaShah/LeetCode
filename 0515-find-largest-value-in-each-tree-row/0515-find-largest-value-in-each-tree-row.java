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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> b=new ArrayList<>();

        int level=height(root);

        for(int i=1;i<=level;i++)
        {
            ArrayList<Integer> a=new ArrayList<>();

            large(root,i,a);
            Collections.sort(a);
            int n=a.size();
            b.add(a.get(n-1));
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

        return Math.max(left, right)+1;
    }

    private void large(TreeNode root, int level, List<Integer> a)
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

        large(root.left,level-1,a);
        large(root.right,level-1,a);
    }
}