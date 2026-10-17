class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            int x=nums[i];
            while(x>0)
            {
                int rem=x%10;
                if(rem==digit)
                {
                    count++;
                }
                x=x/10;
            }
        }
        return count;
    }
}