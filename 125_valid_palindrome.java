class Solution {
    public boolean isPalindrome(String s) {
        String w="";
        if(s==" ")
        {
            return true;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9'))
            {
                w=w+ch;
            }
            else if(ch>='A'&ch<='Z'){
                w+=Character.toLowerCase(ch);
            }
        }
        int j=w.length()-1;
        for(int i=0;i<w.length()/2;i++)
        {
            char ch1=w.charAt(i);
             char ch2=w.charAt(j);
            if(Character.compare(ch1,ch2)!=0)
            {
                return false;
            }
            j--;
        }
        return true;
        
    }
}