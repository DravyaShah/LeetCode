class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;

        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=nums[i];
        }

        Arrays.sort(a);

        int min=a[0];
        int max=a[n-1];
        int val=Integer.MAX_VALUE;

        int a1=0;
        int b1=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==min)
            {
                a1=i;
            }
            if(nums[i]==max)
            {
                b1=i;
            }
        }
        int r1=Math.max(a1,b1);
        val = Math.min(val,(r1+1));

        int a2=0;
        int b2=0;
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]==min)
            {
                a2=i;
            }
            if(nums[i]==max)
            {
                b2=i;
            }
        }
        int r2=Math.min(a2,b2);
        val = Math.min(val,(n-r2));

        int a3=0;
        int b3=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==min || nums[i]==max)
            {
                a3=i+1;
                break;
            }
        }

        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]==min || nums[i]==max)
            {
                b3=n-i;
                break;
            }
        }
        val=Math.min(val,(a3+b3));

        return val;
    }
}