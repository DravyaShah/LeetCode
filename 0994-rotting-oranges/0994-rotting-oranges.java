class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }

        int mins=0;
        while(!q.isEmpty() && fresh>0)
        {
            int size = q.size();  // store it first bcoz afterwards size will change

            for(int k=0;k<size;k++)
            {
                int curr[]=q.poll();

                int i = curr[0];
                int j = curr[1];

                if(i-1 >= 0 && grid[i-1][j]==1)
                {
                    grid[i-1][j]=2;
                    fresh--;
                    q.offer(new int[]{i-1,j});
                }

                if(i+1 < n && grid[i+1][j]==1)
                {
                    grid[i+1][j]=2;
                    fresh--;
                    q.offer(new int[]{i+1,j});
                }

                if(j-1 >= 0 && grid[i][j-1]==1)
                {
                    grid[i][j-1]=2;
                    fresh--;
                    q.offer(new int[]{i,j-1});
                }

                if(j+1 < m && grid[i][j+1]==1)
                {
                    grid[i][j+1]=2;
                    fresh--;
                    q.offer(new int[]{i,j+1});
                }
            }
            mins++;
        }
        if(fresh > 0)
        {
            return -1;
        }
        return mins;
    }
}