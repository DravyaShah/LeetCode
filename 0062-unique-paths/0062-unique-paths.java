class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i], -1);
        }

        return total(m,n,m-1,n-1,dp);
    }

    private int total(int m, int n, int i, int j, int dp[][])
    {
        if(i==0)
        {
            return 1;
        }

        if(j==0)
        {
            return 1;
        }

        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }

        int right = total(m,n,i,j-1,dp);
        int down = total(m,n,i-1,j,dp);

        dp[i][j] = right + down;
        return dp[i][j];
    }
}