class Solution {
    public int countWords(String[] words1, String[] words2) {
          int count=0;
        HashMap<String,Integer> h1=new HashMap<>();
         HashMap<String,Integer> h2=new HashMap<>();
         for(String val:words1)
        {
            if(h1.containsKey(val))
            {
                h1.put(val,h1.get(val)+1);
            }
             else{
                
                h1.put(val,1);
            
             }
         }
        for(String val2:words2)
        {
            if(h2.containsKey(val2))
            {
                h2.put(val2,h2.get(val2)+1);
            }
             else{
                
                h2.put(val2,1);
            
             }
         }
        for(String val3:words1)
        {
            if(h2.containsKey(val3))
            {
                if(h1.get(val3)==1&&h2.get(val3)==1)
                {
                    count++;
                }
            }
        }
        
        return count;
    }
}