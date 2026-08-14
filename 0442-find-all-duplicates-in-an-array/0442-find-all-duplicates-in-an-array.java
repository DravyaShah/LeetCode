class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n-1;i++)
        {
            int j=i+1;

            if(nums[i]==nums[j])
            {
                a.add(nums[i]);
            }
        }
        return a;
    }
}