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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
        {
            return 0;
        }

        List<Integer> a=new ArrayList<>();
        int n=a.size();
        val(root,a);
        Collections.sort(a);
        return a.get(k-1);
    }

    private List<Integer> val(TreeNode root, List<Integer> a)
    {
        if(root==null)
        {
            return a;
        }

        a.add(root.val);

        val(root.left,a);
        val(root.right,a);

        return a;
    }
}