class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>s1=new Stack<Integer>();
         Stack<Integer>s2=new Stack<Integer>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                s1.push(i);
            }
            else if(s.charAt(i)=='*')
            {
                 s2.push(i);
            }
            else{
                if(!(s1.empty()))
                {
                    s1.pop();
                }
                else if(!(s2.empty()))
                {    if(s2.peek()<i)
                {
                    s2.pop();
                }
                }
                else{
                    return false;
                }
            }
        }
        while(!(s1.empty()))
        {
            if(!(s2.empty()))
            { 
            if(s1.peek()<s2.peek())
            {
                s1.pop();
                s2.pop();
            }
             else{
                return false;
            }    
            }
            else{
                return false;
            }
           
        }
        
        if(s1.empty())
        {
            return true;
        }
        else{
            return false;
        }
        
    }
}