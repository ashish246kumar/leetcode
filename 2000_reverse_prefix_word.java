class Solution {
    public String reversePrefix(String word, char ch) {
        int len=word.length();
        int d=0;
        String w="";
        for(int i=0;i<len;i++)
        {
            if(word.charAt(i)==ch)
            {
                d=i;
                break;
            }
        }
        if(d!=0)
        {
            int j=d;
            for(int k=d;k>=0;k--)
            {
                w=w+word.charAt(k);
            }
            w=w+word.substring(d+1);
            return w;
        }
        else{
            return word;
        }
    }
}