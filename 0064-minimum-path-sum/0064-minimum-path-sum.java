class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i], -1);
        }

        return sum(grid,m,n,m-1,n-1,dp);
    }

    private int sum(int grid[][], int m, int n, int i, int j, int dp[][])
    {
        if(i==0 && j==0)
        {
            return grid[0][0];
        }

        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        int left=Integer.MAX_VALUE;
        int down=Integer.MAX_VALUE;

        if(i>0)
        {
            down = sum(grid,m,n,i-1,j,dp);
        }

        if(j>0)
        {
            left = sum(grid,m,n,i,j-1,dp);
        }

        dp[i][j] = grid[i][j]  + Math.min(left,down);
        return dp[i][j];
    }
}