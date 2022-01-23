class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
         HashMap<String,Integer> h1=new HashMap<>();
         HashMap<String,Integer> h2=new HashMap<>();
        int n1=s1.length()+s2.length();
        String str="";
        int k=-1,c=0;
         for(String val:s1.split(" "))
        {
            if(h1.containsKey(val))
            {
                h1.put(val,h1.get(val)+1);
            }
             else{
                
                h1.put(val,1);
            
             }
         }
        for(String val2:s2.split(" "))
        {
            if(h2.containsKey(val2))
            {
                h2.put(val2,h2.get(val2)+1);
            }
             else{
                
                h2.put(val2,1);
            
             }
         }
        for(String val3:s1.split(" "))
        {
            if(!(h2.containsKey(val3)))
            {
                if(h1.get(val3)==1)
                {
                    str=str+val3+" ";
                    c=1;
                }
            }
        }
      for(String val4:s2.split(" "))
        {
            if(!(h1.containsKey(val4)))
            {
                if(h2.get(val4)==1)
                {
                    str=str+val4+" ";
                    c=1;
                }
            }
        }
        if(c==1)
        {    
        String strArray[] = str.split(" ");
        return strArray;}
        else{
            String[] strr=new String[0];
            return strr;
        }
    }
}