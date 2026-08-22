class Solution {
    public boolean checkDivisibility(int n) {
        int x=n;
        int sum=0;
        while(x>0)
        {
            int rem=x%10;
            sum=sum+rem;
            x=x/10;
        }

        int y=n;
        int prod=1;
        while(y>0)
        {
            int rem=y%10;
            prod=prod*rem;
            y=y/10;
        }

        int val=sum+prod;

        if(n%val==0)
        {
            return true;
        }
        return false;
    }
}