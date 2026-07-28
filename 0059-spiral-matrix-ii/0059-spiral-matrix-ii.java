class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][]=new int[n][n];

        int rs=0;
        int re=n-1;
        int cs=0;
        int ce=n-1;

        int a=1;
        while(rs <= re && cs <= ce)
        {
            for(int i=cs;i<=ce;i++)
            {
                mat[rs][i]=a;
                a++;
            }
            rs++;

            for(int i=rs;i<=re;i++)
            {
                mat[i][ce]=a;
                a++;
            }
            ce--;

            if(rs <= re)
            {
                for(int i=ce;i>=cs;i--)
                {
                    mat[re][i]=a;
                    a++;
                }
                re--;
            }

            if(cs <= ce)
            {
                for(int i=re;i>=rs;i--)
                {
                    mat[i][cs]=a;
                    a++;
                }
                cs++;
            }
        }
        return mat;
    }
}