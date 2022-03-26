class Solution {
    public int arrangeCoins(int n) {
        long sum=n;
        long count=0;
        for(long i=1;i<=n;i++)
        {
             sum=sum-i;
            if(sum>=0)
            {
                count++;
            }
            else{
                return (int)count;
            }
            
        }
        return (int)count;
        
    }
}