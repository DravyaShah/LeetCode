class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character> a=new Stack<>();
        int op=0;
        int cp=0;

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                a.push(s.charAt(i));
                op++;
            }
            else if(s.charAt(i)==')' && op>0)
            {
                a.pop();
                op--;
            }
            else
            {
                cp++;
            }
        }
        return cp+op;
    }
}