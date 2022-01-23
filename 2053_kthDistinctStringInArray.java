class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length,j=0,count=0,d=0,m=0;
        HashMap<String,Integer>h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if((h.containsKey(arr[i])))
            {
                h.put(arr[i],h.get(arr[i])+1);
            }
            else{
                
               h.put(arr[i],1);}
        }
         for(j=0;j<n;j++)
          {
             if(h.get(arr[j])==1)
             {
                 count++;
             }
              if(count==k)
              {
                  return arr[j];
              }
               }
        return "";
    }
}