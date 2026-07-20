class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r=new LinkedList<>();
        Queue<Integer> d=new LinkedList<>();
        int n=senate.length();

        for(int i=0;i<n;i++)
        {
            if(senate.charAt(i)=='R')
            {
                r.add(i);
            }
            else
            {
                d.add(i);
            }
        }

        while(!r.isEmpty() && !d.isEmpty())
        {
            if(r.peek() < d.peek())
            {
                d.remove();
                r.add(r.peek()+n);
                r.remove();
            }
            else
            {
                r.remove();
                d.add(d.peek()+n);
                d.remove();
            }
        }

        if(r.isEmpty())
        {
            return "Dire";
        }
        return "Radiant";
    }
}