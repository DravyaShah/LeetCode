class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        int n=nums.length;

        a.add(nums[0]);
        b.add(nums[1]);

        for(int i=2;i<n;i++)
        {
            int x=a.size();
            int y=b.size();
            if(a.get(x-1) > b.get(y-1))
            {
                a.add(nums[i]);
            }
            else
            {
                b.add(nums[i]);
            }
        }
        int c[]=new int[n];
        int x=a.size();
        int y=b.size();

        int d=0;
        int i=0;
        int j=0;

        while(i < x)
        {
            c[d]=a.get(i);
            d++;
            i++;
        }

        while(j < y)
        {
            c[d]=b.get(j);
            d++;
            j++;
        }

        return c;
    }
}