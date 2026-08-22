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
    public void flatten(TreeNode root) {
        if(root==null)
        {
            return;
        }

        List<Integer> a=new ArrayList<>();
        arr(root,a);

        TreeNode current=root;
        for(int i=1;i<a.size();i++)
        {
            TreeNode newnode=new TreeNode(a.get(i));

            current.left=null;
            current.right=newnode;
            
            current=current.right;
        }
        // current.left=null;
        // current.right=null;
    }
    private List<Integer> arr(TreeNode root,List<Integer> a)
    {
        if(root==null)
        {
            return a;
        }

        a.add(root.val);

        arr(root.left, a);
        arr(root.right, a);

        return a;
    }
}