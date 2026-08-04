class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> b=new ArrayList<>();
            long val=1;
            for(int j=0;j<=i;j++)
            {
                b.add((int)val);
                val=val*(i-j)/(j+1);
            }
            a.add(b);
        }
        return a;
    }
}