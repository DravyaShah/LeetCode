class Solution {
    public int smallestNumber(int n, int t) {
        for(int num=n; ;num++)
        {
            int temp=num;
            int pro=1;
            while(temp>0)
            {
                int rem=temp%10;
                pro=pro*rem;
                temp=temp/10;
            }
            if(pro%t==0)
            {
                return num;
            }
        }
    }
}