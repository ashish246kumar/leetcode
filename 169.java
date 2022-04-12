

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans=0,temp=0;
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet())
        {
            if(ans<e.getValue())
            {
                temp=e.getKey();
                ans=e.getValue();
            }
        
        }
        return temp;
    }
}