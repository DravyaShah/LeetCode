class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        int count=0;

        Arrays.sort(nums);

        int target=nums[n/2];      //middle element after sorting

        for(int i=0;i<n;i++)
        {
            count=count+Math.abs(nums[i]-target);
        }

        return count;
    }
}