class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=arr[0];
        int c=0;
        if(arr.length<3)
        {
            return false;
        }
       if(arr[0]>arr[1])
       {
           return false;
       }
        for(int i=1;i<arr.length;i++)
        {
           
             if(arr[i-1]==arr[i])
             {
                 return false;
             }
            if(arr[i-1]>arr[i])
            {
                break;
            }
            c=i;
            
           
        }
         
    if(c==arr.length-2)
    {
         if(arr[c]==arr[c+1])
        {
            return false;
        }
      return  true;
    }
    if(c==arr.length-1)
    {
       
        return false;
    }
        for(int i=c+1;i<arr.length-1;i++)
        {
           if(arr[i]==arr[i+1])
           {
               return false;
           }
            if(arr[i]<arr[i+1])
            {
                 return false;
            }
        }
        return true;
    }
}