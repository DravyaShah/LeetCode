class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=g.length;
        int m=s.length;
        int c=0;
        int i=0;
        int j=i;

        while(i < n && j < m)
        {
            if(s[j] >= g[i])
            {
                c++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return c;
    }
}