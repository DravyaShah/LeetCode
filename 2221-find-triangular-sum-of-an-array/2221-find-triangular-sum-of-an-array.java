class Solution {
    public int triangularSum(int[] nums) {
        return triangle(nums,nums.length);
    }

    private int triangle(int nums[], int n)
    {
        if(n==1)
        {
            return nums[0];
        }

        for(int i=0;i<n-1;i++)
        {
            nums[i] = (nums[i]+nums[i+1]) % 10;
        }
        return triangle(nums,n-1);
    }
}