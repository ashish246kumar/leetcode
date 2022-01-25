class Solution {
    public int maxVowels(String s, int k) {
        int max=0,count=0,n=s.length();
        String s1="aeiouAEIOU";
        for(int i=0;i<k;i++)
        {
            if(s1.contains(s.charAt(i)+""))
            {
                count++;
            }
        }
            for(int j=k;j<n;j++)
            {
                if(max<count)
             {
                 max=count;
             }
                
                if(s1.contains(s.charAt(j)+""))
                {
                    count=count+1;
                }
                if(s1.contains(s.charAt(j-k)+""))
                {
                    count=count-1;
                }
            }
             // System.out.println(count);
             if(max<count)
             {
                 max=count;
             }
             
        
       return max;
    }
}