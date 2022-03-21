class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        char[] g=s.toCharArray();
        if(s.length()<2)
        {
            return 0;
        }
        for(int i=2;i<s.length();i++)
        {
            if(g[i-2]!=g[i-1]&&g[i-2]!=g[i]&&g[i-1]!=g[i])
            {
                count++;
            }
        }
        return count;
        
    }
}