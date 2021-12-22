class Solution {
    public boolean isHappy(int n) {
        int x=n,c=0,a=0;
        int sum=0;
        int rem=0;
        Set<Integer>myset=new HashSet<Integer>();
        while(true)
        {
           
            if(x>0)
            {
              
                rem=x%10;
                x=x/10;
                sum=sum+rem*rem;
                
            }
            else if(sum==1)
            {
                return true;
            }
            else
            {
               if(myset.contains(sum))
               {
                   return false;
               }
               myset.add(sum);
                x=sum;
                
                sum=0;
            }
        }
       
    }
}