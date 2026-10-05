class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        Stack<Integer> a=new Stack<>();
        a.push(0);

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                a.push(0);
            }

            else
            {
                int val = a.pop();

                if(val==0)
                {
                    val=1;
                }

                else
                {
                    val = 2*val;
                }

                int prev = a.pop();
                a.push(prev + val);
            }
        }
        return a.peek();
    }
}