
   class Solution {
    public String reverseWords(String s) {
       int n=s.length(),count=0,d=0;
        String p="",w="";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=' ')
            {
                if(d==1)
                {
                    w="";
                    d=0;
                }
                w=w+s.charAt(i);
                
                count=0;
            }
            
            else{
                 
                if(s.charAt(i)==' ')
                {
                    count=count+1;
                }
                if(count==1&&w!="")
                {
                    p=w+" "+p;
                    d=1;
                }
            }
            
        }
        if(s.charAt(n-1)!=' ')
        {
            p=w+" "+p;
        }
        return p.substring(0,p.length()-1);
    }
    
}