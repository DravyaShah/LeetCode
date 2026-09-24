class Solution {
    public int smallestIndex(int[] nums) {
        int rem=0;
        int c=0;

        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int countd=0;
            while(n>0)
            {
                rem=n%10;
                countd=countd+rem;
                n=n/10;
            }
            if(countd==i)
            {
                return i;
            }
        }
        return -1;
    }
}