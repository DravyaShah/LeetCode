class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int a=0;
        int val=0;

        while(a<n)
        {
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            
            for(int i=0;i<a+1;i++)
            {
                max=Math.max(max,nums[i]);
            }
            for(int i=a;i<n;i++)
            {
                min=Math.min(min,nums[i]);
            }
            val=max-min;
            if(val<=k)
            {
                return a;
            }
            a++;
        }
        return -1;
    }
}