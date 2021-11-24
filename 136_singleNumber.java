class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
       
        int i=1;
        if(nums.length==1)
        {
            return nums[0];
        }
        while(i<nums.length)
        {
            if(nums[i-1]==nums[i])
            {
                i=i+2;
            }
            else{
                return nums[i-1];
            }
        }
        if(i>=nums.length)
        {
            return nums[i-1];
        }
        return 0;
    }
}