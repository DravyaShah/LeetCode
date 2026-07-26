class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> r=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++)
            {
                min=Math.min(min,matrix[i][j]);
            }
            r.add(min);
        }

        ArrayList<Integer> c=new ArrayList<>();
        for(int i=0;i<matrix[0].length;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++)
            {
                max=Math.max(max,matrix[j][i]);
            }
            c.add(max);
        }

        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==r.get(i) && matrix[i][j]==c.get(j))
                {
                    a.add(matrix[i][j]);
                }
            }
        }
        return a;
    }
}