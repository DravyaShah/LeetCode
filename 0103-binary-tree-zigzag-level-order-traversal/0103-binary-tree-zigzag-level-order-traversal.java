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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> b=new ArrayList<>();

        if(root==null)
        {
            return b;
        }

        int level=height(root);

        for(int i=1;i<=level;i++)
        {
            List<Integer> a=new ArrayList<Integer>();
            zz(root, i, a);
            if (i % 2 == 0) 
            {
                Collections.reverse(a);
            }

            b.add(a);
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

    private void zz(TreeNode root, int level, List<Integer> a)
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

        zz(root.left,level-1,a);
        zz(root.right,level-1,a);
    }
}