class Solution {
    public int maxProduct(int n) {
        int count=0;
        int temp=n;
        while(temp>0)
        {
            int rem=temp%10;
            temp=temp/10;
            count++;
        }

        int ans[]=new int[count];
        int i=0;
        while(n>0)
        {
            int rem=n%10;
            ans[i]=rem;
            n=n/10;
            i++;
        }

        Arrays.sort(ans);

        int x=ans.length;

        return ans[x-1]*ans[x-2];
    }
} 