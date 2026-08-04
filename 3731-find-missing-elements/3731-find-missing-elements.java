class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> a=new ArrayList<>();
        int x=nums[0];
        int y=0;

        while(x <= nums[n-1])
        {
            if(x == nums[y])
            {
                x++;
                y++;
            }
            else
            {
                a.add(x);
                x++;
            }
        }
        return a;
    }
}