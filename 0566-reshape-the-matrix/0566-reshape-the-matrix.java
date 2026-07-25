class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                count++;
            }
        }
        if((r*c) != count)
        {
            return mat;
        }

        int a[]=new int[r*c];
        int b=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                a[b]=mat[i][j];
                b++;
            }
        }

        int d=0;
        int m[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                m[i][j]=a[d];
                d++;
            }
        }
        return m;
    }
}