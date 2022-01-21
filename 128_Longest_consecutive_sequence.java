class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int val:nums)
        {
            if(h1.containsKey(val))
            {
                h1.put(val,h1.get(val)+1);
            }
            if(h1.containsKey(val-1))
            {
                int d1=h1.get(val-1);
               
                h1.put(val,d1+1);
            }
            else{
                h1.put(val,1);
            }
        }
        for(int val1:h1.keySet())
        {
        if(max<h1.get(val1))
        {
            max=h1.get(val1);
        }
        }
        return max;

}
    }
    