class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }

        int target=sum-x;

        if(target < 0)
        {
            return -1;
        }

        if(target==0)
        {
            return n;
        }

        int l=0;
        int ms=0;
        int ml=-1;

        for(int r=0;r<n;r++)
        {
            ms=ms+nums[r];

            while(l<=r && ms > target)
            {
                ms=ms-nums[l];
                l++;
            }

            if(ms==target)
            {
                ml=Math.max(ml,r-l+1);
            }
        }

        if(ml==-1)
        {
            return -1;
        }

        return n-ml;
    }
}