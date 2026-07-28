class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        boolean r1=true;
        boolean r2=true;
        boolean r3=true;
        boolean r4=true;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j] != target[i][j])
                {
                    r1=false;
                }

                if(mat[i][j] != target[j][n-1-i])
                {
                    r2=false;
                }

                if(mat[i][j] != target[n-1-j][i])
                {
                    r3=false;
                }

                if(mat[i][j] != target[n-1-i][n-1-j])
                {
                    r4=false;
                }
            }
        }
        return r1 || r2 || r3 || r4;
    }
}