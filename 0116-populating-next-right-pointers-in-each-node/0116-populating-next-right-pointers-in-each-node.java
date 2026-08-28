/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    Node prev = null;
    public Node connect(Node root) {
        if(root==null)
        {
            return null;
        }

        int level = height(root);

        for (int i=1;i<=level;i++) 
        {
            prev = null;
            currlevel(root, i);
        }
        return root;
    }

    private int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=height(root.left);
        int right=height(root.right);

        return Math.max(left,right)+1;
    }

    private void currlevel(Node root, int level)
    {
        if(root==null)
        {
            return;
        }

        if(level==1)
        {
            if (prev != null) 
            {
                prev.next = root;
            }

            prev = root;

            return;
        }

        currlevel(root.left,level-1);
        currlevel(root.right,level-1);
    }
}