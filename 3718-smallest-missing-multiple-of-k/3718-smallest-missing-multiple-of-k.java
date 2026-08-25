class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            map.put(i,nums[i]);
        }

        int b=0;

        while(!map.isEmpty())
        {
            b++;
            int x=k*b;
            if(!map.containsValue(x))
            {
                return x;
            }
        }
        return k*n;
    }
}