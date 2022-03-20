class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int s1=0,s2=0;
        int[] ans=new int[2];
        for(int i=0;i<aliceSizes.length;i++)
        {
            s1+=aliceSizes[i];
        }
         for(int i=0;i<bobSizes.length;i++)
        {
            s2+=bobSizes[i];
        }
        for(int i=0;i<aliceSizes.length;i++)
        {
            for(int j=0;j<bobSizes.length;j++)
            {
                int dif=aliceSizes[i]-bobSizes[j];
                if(s1-dif==s2+dif)
                {
                    ans[0]=aliceSizes[i];
                    ans[1]=bobSizes[j];
                    return ans;
                }
                
            }
        }
        return ans;
        
    }
}