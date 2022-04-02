class Solution {
     public static boolean ispossible(int[] nums,int th,int mid)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=(int)Math.ceil(nums[i]*1.0/mid);
        }
        return sum<=th;
        
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
      
        for(int val:nums)
        {
            max=Math.max(max,val);
        }
          if( threshold==nums.length)
        {
            return max;
        }
    
        int l=1,h=max;
        int store=Integer.MAX_VALUE;
        while(l<=h)
        {
         int mid=l+(h-l)/2;
            if(ispossible(nums,threshold,mid)==true)
            {
                store=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
                
            }
        }
        return store;
    }
}