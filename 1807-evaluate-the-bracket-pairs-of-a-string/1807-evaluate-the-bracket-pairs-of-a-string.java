class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map=new HashMap<>();

        for(int i=0;i<knowledge.size();i++)
        {
            ArrayList<String> a=(ArrayList<String>)knowledge.get(i);
            map.put(a.get(0),a.get(1));
        }

        StringBuilder ans=new StringBuilder();
        int start=-1;

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                start=i;
            }

            else if(c==')')
            {
                String word=s.substring(start+1,i);
                ans.append(map.getOrDefault(word,"?"));
                start = -1;
            }

            else if(start<0)
            {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}