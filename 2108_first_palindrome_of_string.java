class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        int d=0,e=0;
        String s="";
        for(int i=0;i<n;i++)
        {
            d=0;
            e=0;
            s=words[i];
            int p=s.length()-1;
            for(int j=0;j<(s.length()/2);j++)
            {
                if(s.charAt(j)==s.charAt(p))
                {
                    d=1;
                }
                else{
                    e=1;
                    break;
                }
                p=p-1;
            }
            if(e!=1)
            {
                return s;
            }
            
        }
        return "";
        
    }
}