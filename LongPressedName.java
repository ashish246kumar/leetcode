class Solution {
    public boolean isLongPressedName(String name, String typed) {
      
       int n1=name.length(),n2=typed.length();
        if(n2<n1)
        {
            System.out.println(n2);
            return false;
        }
        int i=0,j=0;
        while(i<n1||j<n2)
        {
            if(j>=n2)
            {
                return false;
            }
             if(i<n1&&name.charAt(i)==typed.charAt(j))
             {
                 i++;
                 j++;
             }
            else if(i!=0&&name.charAt(i-1)==typed.charAt(j))
            {
                j++;
            }
            else{
                return false;
            }
            
        }
        return true;
        
    }
}