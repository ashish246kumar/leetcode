class Solution {
    public int firstUniqChar(String s) {
        int c[]=new int[26];
        for(char d:s.toCharArray())
        {
            c[d-'a']=c[d-'a']+1;
            
        }
        for(int i=0;i<s.length();i++)
        {
            if(c[(s.charAt(i))-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}