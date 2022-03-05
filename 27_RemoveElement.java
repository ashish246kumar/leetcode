class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1,c=0,d=0;
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1&&nums[0]==val)
        {
            return i;
        }
        while(i<j)
        {
            if(nums[i]!=val)
            {
                i++;
            }
            else{
                c=1;
            }
            if(nums[j]==val)
            {
                j--;
            }
            else{
               d=1;
            }
            if(c==1&&d==1)
            {
                c=0;
                d=0;
                nums[i]=nums[j];
                i++;
                j--;
            }
        }
        if(i==j&&nums[i]!=val)
        {
            i++;
        }
        return i;
    }
}