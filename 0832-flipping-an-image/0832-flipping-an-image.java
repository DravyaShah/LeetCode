class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;

        for(int i=0;i<n;i++)
        {
            int cs=0;
            int ce=n-1;
            
            while(cs <= ce)
            {
                int temp=image[i][cs];
                image[i][cs]=image[i][ce];
                image[i][ce]=temp;
                
                cs++;
                ce--;
            }
        }

        int a[][]=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(image[i][j]==0)
                {
                    a[i][j]=1;
                }
                else
                {
                    a[i][j]=0;
                }
            }
        }
        return a;
    }
}