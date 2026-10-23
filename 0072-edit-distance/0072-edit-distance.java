class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();

        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                dp[i][j]=-1;
            }
        }
        return distance(word1,word2,n,m,n,m,dp);
    }

    private int distance(String word1, String word2, int n, int m, int i, int j, int dp[][])
    {
        if(i==0)
        {
            return j;
        }

        if(j==0)
        {
            return i;
        }

        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }

        if(word1.charAt(i-1) == word2.charAt(j-1))
        {
            dp[i][j] = distance(word1, word2, n, m, i-1, j-1, dp);
        }

        else
        {
            dp[i][j] = 1 + Math.min(distance(word1,word2,n,m,i-1,j,dp),
                                    Math.min(distance(word1,word2,n,m,i,j-1,dp), distance(word1,word2,n,m,i-1,j-1,dp)));
        }
        return dp[i][j];
    }
}