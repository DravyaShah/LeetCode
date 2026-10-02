class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> a=new ArrayList<>();
        gp("", n, n, n, a);
        return a;
    }

    private void gp(String curr, int n, int open, int close, List<String> a)
    {
        if(open==0 && close==0)
        {
            a.add(curr);
            return;
        }

        if(open > 0)
        {
            gp(curr+'(', n, open-1, close, a);
        }

        if(open < close)
        {
            gp(curr+')', n, open, close-1, a);
        }
    }
}