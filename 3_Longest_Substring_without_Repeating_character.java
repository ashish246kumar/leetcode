lass Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=-1,j=-1,a=0;
        HashMap<Character,Integer> map= new HashMap<>();
        while(true)
        {
           boolean f1=false;
             boolean f2=false;
            while(i<s.length()-1)
            {
                f1=true;
                i++;
                char ch=s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
               if(map.get(ch)==2)
               {
                  break;
                   
               }  
                else
                {int len=i-j;
                   if(len>a)
                   {
                       a=len;
                   }
                  
               }