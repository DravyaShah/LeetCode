class Solution {
    public int reverseDegree(String s) {
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            int index_no= 26-s.charAt(i)+'a';
            int value=index_no*(i+1);
            result=result+value;
        }
        return result;
    }
}