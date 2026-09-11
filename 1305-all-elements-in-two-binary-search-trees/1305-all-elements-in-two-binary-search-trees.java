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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();

        tree1(root1,a);
        tree2(root2,b);
        
        a.addAll(b);

        Collections.sort(a);

        return a;
    }

    private List<Integer> tree1(TreeNode root1, List<Integer> a)
    {
        if(root1==null)
        {
            return a;
        }

        a.add(root1.val);

        tree1(root1.left,a);
        tree1(root1.right,a);

        return a;
    }

    private List<Integer> tree2(TreeNode root2, List<Integer> b)
    {
        if(root2==null)
        {
            return b;
        }

        b.add(root2.val);

        tree2(root2.left,b);
        tree2(root2.right,b);

        return b;
    }
}