class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0,maxsum=0;
       int j=nums.length-1;
        int[] b=new int[nums.length/2];
    for(int i=0;i<(nums.length/2);i++)
    {
        sum=nums[i]+nums[j];
        if(maxsum<sum)
        {
            maxsum=sum;
        }
        j=j-1;
    }
        return maxsum;
    }
}