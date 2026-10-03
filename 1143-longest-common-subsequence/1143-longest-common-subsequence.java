class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();

        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return LCS(text1,text2,n,m,0,0,dp);
    }

    private int LCS(String text1, String text2, int n, int m, int i, int j, int dp[][])
    {
        if(i==n || j==m)
        {
            return 0;
        }

        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }

        if(text1.charAt(i) == text2.charAt(j))
        {
            dp[i][j] = 1+LCS(text1, text2, n, m, i+1, j+1, dp);
        }

        if(text1.charAt(i) != text2.charAt(j))
        {
            int c1 = LCS(text1, text2, n, m, i+1, j, dp);
            int c2 = LCS(text1, text2, n, m, i, j+1, dp);
            dp[i][j] = Math.max(c1,c2);
        }

        return dp[i][j];
    }
}