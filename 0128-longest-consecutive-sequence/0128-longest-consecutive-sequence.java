class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        if(n==0)
        {
            return 0;
        }
        
        int mc=1;
        int c=1;
        int i=0;
        while(i < n-1)
        {
            if(nums[i] == nums[i+1]-1)
            {
                c++;
                i++;
                mc=Math.max(mc,c);
            }
            else if(nums[i]==nums[i+1])
            {
                i++;
            }
            else
            {
                i++;
                c=1;
            }
        }
        return mc;
    }
}