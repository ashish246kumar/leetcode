class Solution {
    public int mySqrt(int x) {
        long l=0,h=x;
        long  mid=0,ans=0;
        mid=l+(h-l)/2;
        while(l<=h)
        {
            if(mid*mid==x)
            {
                return (int)mid;
            }
            else if(mid*mid>x)
            {
                h=mid-1;
            }
            else{
                ans=mid;
                l=mid+1;
            }
             mid=l+(h-l)/2;
        }
        return (int)ans;
    }
}