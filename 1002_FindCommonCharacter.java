class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> h=new HashMap<>();
        List<String>res=new ArrayList<String>();
        if(words.length==0)
        {
            return res;
        }
        String s=words[0];
        for(int i=0;i<s.length();i++)
        {
            if(h.containsKey(s.charAt(i)))
            {
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
                
            }
            else{
                h.put(s.charAt(i),1);
            }
        }
        for(int j=1;j<words.length;j++)
        {
            HashMap<Character,Integer> h1=new HashMap<>();
            for(int k=0;k<words[j].length();k++)
            {
             char curr= words[j].charAt(k);
                if(h.containsKey(curr))
                {
                    if(h1.containsKey(curr))
                    {
                        h1.put(curr,Math.min(h1.get(curr)+1,h.get(curr)));
                    }
                    else
                    {
                        h1.put(curr,1);
                    }
                }
            }
            h=h1;
        }
        for(char c:h.keySet())
        {
            for(int m=0;m<h.get(c);m++)
            {
                res.add(c+"");
            }
        }
        return res;
    }
}