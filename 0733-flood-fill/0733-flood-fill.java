class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int val=image[sr][sc];

        if(val == color) 
        {
            return image;
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==sr && j==sc)
                {
                    color(image,n,m,i,j,color,val);
                }
            }
        }
        return image;
    }

    private void color(int image[][], int n, int m, int i, int j, int color, int val)
    {
        if(i<0 || j<0 || i>=n || j>=m)
        {
            return;
        }

        if(image[i][j] != val)
        {
            return;
        }

        image[i][j]=color;

        color(image,n,m,i-1,j,color,val);
        color(image,n,m,i+1,j,color,val);
        color(image,n,m,i,j-1,color,val);
        color(image,n,m,i,j+1,color,val);
    }
}