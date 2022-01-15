class Solution {
    public int countPrimes(int n) {
        boolean p[] =new boolean[n];
       if(n==0||n==1)
       {
           return 0;
       }
        p[0]=false;
        p[1]=false;
        int c=0;
        for(int i=2;i<n;i++)
        {
            p[i]=true;
        }
        for(int i=2;i<n;i++)
        {
            if(p[i])
            {
                c++;
                for(int j=2*i;j<n;j=j+i)
                {
                    p[j]=false;
                }
            }
        }
        
        return c;