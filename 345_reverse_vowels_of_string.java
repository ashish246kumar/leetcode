class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1,n=s.length(),de=0,df=0;
        char[] ch=s.toCharArray();
        String vowels="aeiouAEIOU";
         while(i<j)
         {
             while(i<j&&!vowels.contains(ch[i]+""))
             {
               
                 i=i+1;
             }
             while(i<j&&!vowels.contains(ch[j]+""))
             {
                 
                 j=j-1;
             }
             if(i<j)
             {
                 char temp=ch[i];
                 ch[i]=ch[j];
                 ch[j]=temp;
             }
                 i++;
             j--;
         }
        return new String(ch);
    }
}