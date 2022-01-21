class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>h1=new HashMap<>();
        int minlen=0,len1=nums1.length,len2=nums2.length,k=0;
         for(int val:nums1)
        {
             if(h1.containsKey(val))
             {
               h1.put(val,h1.get(val)+1);
             }
             else{
                h1.put(val,1);
            }
        }
         for(int val2:nums2)
         {
             if(h1.containsKey(val2))
             {
                
                 nums1[k++]=val2;
                
                 
                 h1.remove(val2);
             }
         }
         int[] nums4=new int[k];
        for(int j=0;j<k;j++)
        {
            
            nums4[j]=nums1[j];
        }
        return nums4;
    }
}