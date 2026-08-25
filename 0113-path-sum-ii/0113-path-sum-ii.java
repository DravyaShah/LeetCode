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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> b=new ArrayList<>();
        if(root==null)
        {
            return b;
        }

        ArrayList<Integer> a=new ArrayList<>();
        ps(root,targetSum,0,a,b);

        return b;
    }

    private void ps(TreeNode root, int targetSum, int s, List<Integer> a, List<List<Integer>> b)
    {
        if(root==null)
        {
            return;
        }

        s=s+root.val;
        a.add(root.val);

        if(root.left==null && root.right==null && s==targetSum)
        {
            b.add(new ArrayList<>(a));
        }

        ps(root.left,targetSum,s,a,b);
        ps(root.right,targetSum,s,a,b);

        a.remove(a.size()-1);
    }
}