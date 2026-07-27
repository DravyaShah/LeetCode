class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        ArrayList<Integer> a=new ArrayList<>();

        int rs=0;
        int re=n-1;
        int cs=0;
        int ce=m-1;

        while(rs <= re && cs <= ce)
        {
            for(int i=cs;i<=ce;i++)
            {
                a.add(matrix[rs][i]);
            }
            rs++;

            for(int i=rs;i<=re;i++)
            {
                a.add(matrix[i][ce]);
            }
            ce--;

            if(rs <=re)
            {
               for(int i=ce;i>=cs;i--)
               {
                a.add(matrix[re][i]);
               }
               re--; 
            }

            if(cs <= ce)
            {
                for(int i=re;i>=rs;i--)
                {
                    a.add(matrix[i][cs]);
                }
                cs++;
            }
        }
        return a;
    }
}