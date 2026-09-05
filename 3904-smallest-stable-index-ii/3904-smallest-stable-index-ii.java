class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;

        int back[]=new int[n];
        back[n-1]=nums[n-1];

        for(int i=n-2;i>=0;i--)
        {
            back[i]=Math.min(back[i+1],nums[i]);
        }

        int front=0;
        for(int i=0;i<n;i++)
        {
            front=Math.max(front,nums[i]);
            if((front-back[i]) <= k)
            {
                return i;
            }
        }
        return -1;
    }
}