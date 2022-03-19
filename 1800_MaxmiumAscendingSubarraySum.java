class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=0,max=nums[0];
        if(nums.length>0)
        {
            sum=nums[0];
        }
       for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                sum+=nums[i];
            }
            if(max<sum)
            {
                max=sum;
            }
            if(nums[i-1]>=nums[i])
            {
                sum=nums[i];
            }
        }
        return max;
    }
}