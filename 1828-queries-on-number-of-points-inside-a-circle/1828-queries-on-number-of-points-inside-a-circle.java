class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int x[]=new int[queries.length];

        for(int i=0;i<queries.length;i++)
        {
            int c=0;
            for(int j=0;j<points.length;j++)
            {
                int dx=queries[i][0]-points[j][0];
                int dy=queries[i][1]-points[j][1];

                if((dx*dx) + (dy*dy) <= (queries[i][2]*queries[i][2]))
                {
                    c++;
                }
            }
            x[i]=c;
        }
        return x;
    }
}