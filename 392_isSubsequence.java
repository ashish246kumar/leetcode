class Solution {
    public boolean isSubsequence(String s, String t) {
        char ch1='a',ch2='b';
        if(s.length()==0)
        {
            return true;
        }
        int j=0,i=0;
        while(j<t.length())
        {
            if(i==s.length()-1&&Character.compare(s.charAt(i),t.charAt(j))==0)
            {
                return true;
            }
            if(i<s.length())
            {
                ch1=s.charAt(i);
            }
            if(j<t.length())
            {
                 ch2=t.charAt(j);
            }
             if(Character.compare(ch1,ch2)==0&&i<s.length())
            {
                i++;
                j++;
            }
             else{
                j++;
            }
            
            
        }
        return false;
    }
}