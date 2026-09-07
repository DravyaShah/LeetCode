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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        {
            return true;
        }

        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();

        left(root,a);
        right(root,b);

        if(a.size() != b.size())
        {
            return false;
        }

        for(int i=0;i<a.size();i++)
        {
            if(a.get(i) != b.get(i))
            {
                return false;
            }
        }
        return true;
    }
    
    private void left(TreeNode root, List<Integer> a)
    {
        if(root==null)
        {
            a.add(null);
            return;
        }

        a.add(root.val);

        left(root.left,a);
        left(root.right,a);
    }
    
    private void right(TreeNode root, List<Integer> b)
    {
        if(root==null)
        {
            b.add(null);
            return;
        }

        b.add(root.val);

        right(root.right,b);
        right(root.left,b);
    }
}