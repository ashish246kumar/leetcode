class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length, index = 1, count = 1;
        for(int i=1;i<n;i++){
            if(nums[i-1] == nums[i]) count++;
            else count = 1;
            if(count <= 2) nums[index++] = nums[i];  
        }
        return index;
    }
}