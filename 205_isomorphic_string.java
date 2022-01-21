class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h=new  HashMap<Character,Character>();
        HashMap<Character,Character> h1=new  HashMap<Character,Character>();
        for(int i=0;i<s.length();i++)
        {
        if(!h.containsKey(s.charAt(i)))
        {
            h.put(s.charAt(i),t.charAt(i));
        }
        else 
        {
            if(t.charAt(i)!=h.get(s.charAt(i)))
            {
                return false;
            }
        }
        }
         for(int j=0;j<t.length();j++)
        {
        if(!h1.containsKey(t.charAt(j)))
        {
            h1.put(t.charAt(j),s.charAt(j));
        }
        else 
        {
            if(s.charAt(j)!=h1.get(t.charAt(j)))
            {
                return false;
            }
        }
        }
        return true;
    }
}