class Solution {
    public boolean checkIfExist(int[] arr) {
      HashSet<Integer> h=new HashSet<>();
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            h.add(arr[i]);
            int rem=arr[i]%2;
            int q=arr[i]/2;
            if(arr[i]==0)
            {
                c++;
                continue;
            }
            
            else if(h.contains(arr[i]*2))
            {
                return true;
            }
            else if(rem==0)
            {
                if(h.contains(q))
                    
                {
                    return true;
                }
            }
            
        }
        if(c!=0&&c%2==0)
            {
                return true;
            }
        return false;
    }
}