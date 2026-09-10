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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;

        return tree(nums,0,n-1);
    }

    private TreeNode tree(int nums[], int s, int e)
    {
        if(s > e)
        {
            return null;
        }

        int mid=s+(e-s)/2;

        TreeNode a=new TreeNode(nums[mid]);

        a.left = tree(nums,s,mid-1);
        a.right = tree(nums,mid+1,e);

        return a;
    }
}