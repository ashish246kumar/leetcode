class Solution {
    public int countVowelSubstrings(String word) {
   Set<Character> s=new HashSet<>();
        int count=0;
        int n=word.length();
        for(int i=0;i<n-4;i++)
        {
            s.clear();
            for(int j=i;j<n;j++)
            {
                char ch=word.charAt(j);
               
             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           {
                 
            s.add(ch);
            if(s.size()==5)
            {
                count++;
            }
        }
                else{
                    break;
                }
                
            }
        }
       
       
       
       
       
       return count;
       
    }
}