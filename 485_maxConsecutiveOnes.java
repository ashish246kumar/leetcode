class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0,c=0, max=0;
        while(j<nums.length)
        {
            if(nums[i]==1&&nums[j]==1)
            {
                c++;
                j++;
            } 
            else{
                if(max<c)
                {
                    max=c;
                }
                c=0;
                j++;
                i=j;
            }
                
        }
        if(max<c)
        {
            max=c;
        }
        return max;
    }
}