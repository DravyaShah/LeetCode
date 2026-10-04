class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int m=cost.length;

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=gas[i]-cost[i];
        }

        int val=0;
        int j=0;
        int nt=0;
        while(j<n)
        {
            val = val + a[j];
            if(val < 0)
            {
                val=0;
                nt=j+1;
            }
            j++;
        }

        int temp=nt;
        // for(int i=0;i<a.length;i++)
        // {
        //     if(a[i] >= 0)
        //     {
        //         temp=i;
        //         break;
        //     }
        // }

        int total=0;
        for(int i=temp;i<a.length;i++)
        {
            total = total + a[i];
            if(total < 0)
            {
                return -1;
            }
        }

        for(int i=0;i<temp;i++)
        {
            total = total + a[i];
            if(total < 0)
            {
                return -1;
            }
        }

        if(total >= 0)
        {
            return temp;
        }
        return -1;
    }
}