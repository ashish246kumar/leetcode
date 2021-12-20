class Solution {
    public int minOperations(int n) {
        int mid=0;
        int half=0;
        int sum=0;
        if(n==1)
        {
            return 0;
        }
         if(n==2)
        {
            return 1;
        }
        
        if(n%2==0)
        {
            mid=n/2;
           half=((2*(mid-1)+1)+(2*mid+1))/2;
            for(int i=0;i<mid;i++)
            {
                sum=sum+(half-(2*i+1));
            }
            return sum;
        }
        else{
            mid=n/2;
            half=2*mid+1;
            for(int i=0;i<mid;i++)
            {
                sum=sum+(half-(2*i+1));
            }
            return sum;
        }
    }
}