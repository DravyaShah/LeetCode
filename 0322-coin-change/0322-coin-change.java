class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-2);

        int ans = cc(coins, amount, dp);

        if(ans==Integer.MAX_VALUE)
        {
            return -1;
        }
        return ans;
    }

    private int cc(int coins[], int amount, int dp[])
    {
        if(amount==0)
        {
            return 0;
        }

        if(amount < 0)
        {
            return Integer.MAX_VALUE;
        }

        if(dp[amount] != -2)
        {
            return dp[amount];
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
            int result=cc(coins,amount-coins[i],dp);

            if(result != Integer.MAX_VALUE)
            {
                min = Math.min(min, result+1);
            }
        }

        dp[amount] = min;
        return dp[amount];
    }
}