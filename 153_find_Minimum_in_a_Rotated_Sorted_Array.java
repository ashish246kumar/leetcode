class Solution {
    public int findMin(int[] nums) {
          int mid=0,s=0,e=nums.length-1;
        
        mid=s+(e-s)/2;
        if(nums[s]>nums[e])
        {      
        while(s<e)
        {
           if(nums[0]<=nums[mid])
           {
               s=mid+1;
           }
            else{
                e=mid;
            }
           mid=s+(e-s)/2; 
            
        }
          return nums[e];  
        }
        else{
            return nums[0];
        }
        
    }
}