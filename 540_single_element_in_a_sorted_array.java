class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int mid;
        int b=0;
        int c=0;
        if(nums.length==1)
        {
           return nums[0] ;
        }
        if(nums[l]!=nums[l+1])
        {
            return nums[l];
        }
          if(nums[h]!=nums[h-1])
        {
            return nums[h];
        }
        
        while(l<=h)
        {
            mid=l+(h-l)/2;
            // nums[mid]!=nums[mid-1]&&
                if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1])
                {
                  
                   return nums[mid];
                }
            // nums[mid]== nums[mid-1]&&
            else if((nums[mid] == nums[mid+1] && (mid%2) == 0)||(nums[mid] == nums[mid-1]&&(mid%2)!=0))
            {
               
                l=mid+1;
            }
            else
            {
                h=mid-1;
               
            }
            
        }
       return -1;
        
    }
}