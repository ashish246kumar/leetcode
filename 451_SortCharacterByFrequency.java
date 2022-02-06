class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        ArrayList<Character>al=new ArrayList<Character>(h.keySet());
        Collections.sort(al,(a,b) ->h.get(b)-h.get(a));
        // String word="";
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<al.size();j++)
        {
            char m=al.get(j);
            int n=h.get(m);
            for(int g=0;g<n;g++)
            {
               sb.append(m);
            }
        }
        return sb.toString();
    }
}