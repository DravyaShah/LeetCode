class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int reach=0;

        for(int i=0;i<n;i++)
        {
            if(i > reach)
            {
                return false;
            }

            int temp=nums[i];
            int j=1;

            while(j<=temp)
            {
                if(i+j >= n-1)
                {
                    return true;
                }
                j++;
            }

            if(i + temp > reach)
            {
                reach=i+temp;
            }
        }
        return true;
    }
}