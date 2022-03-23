class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        for(int i=0;i<len/2;i++)
        {
            String s1=s.substring(0,i+1);
            if(len%s1.length()==0)
            {
                int n=len/s1.length();
                StringBuilder st=new StringBuilder();
                while(n>0)
                {
                    
                    n--;
                    st.append(s1);
                }
                if(st.toString().equals(s))
                {
                    return true;
                }
                
            }
        }
        return false;
    }
}