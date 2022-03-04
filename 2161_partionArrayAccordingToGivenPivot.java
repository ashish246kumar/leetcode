class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
int [] a=new int[nums.length];
        int c=0,k=-1,j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==pivot)
            {
                c++;
            }
            if(nums[i]<pivot)
            {
                a[++k]=nums[i];
                // k++;
            }
        }
        while(j<c)
        {
            a[++k]=pivot;
            j++;
            // k++;
        }
        for(int i=0;i<nums.length;i++)
        {
              if(nums[i]>pivot)
            {
                a[++k]=nums[i];
                // k++;
            }
        }
        return a;
    }
}