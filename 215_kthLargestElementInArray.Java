class Solution {
    public int findKthLargest(int[] nums, int k) {
        int d=0,count=1;
    PriorityQueue<Integer> pq=new  PriorityQueue<>(Collections.reverseOrder());
        for(int val:nums)
        {
            pq.add(val);
        }
        while(pq.size()>0)
        {
            if(count==k)
            {
                d=pq.peek();
                break;
            }
            pq.remove();
            count++;
        }
        return d;
    }
}