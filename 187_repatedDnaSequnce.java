class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer>h=new HashMap<>();
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<s.length()-9;i++)
        {
            String s1=s.substring(i,i+10);
            h.put(s1,h.getOrDefault(s1,0)+1);
        }
        for(Map.Entry<String,Integer>m:h.entrySet())
        {
            if(m.getValue()>1)
            {
                al.add(m.getKey());
            }
            
        }
        return al;
    }
}