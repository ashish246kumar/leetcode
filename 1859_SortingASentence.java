class Solution {
    public String sortSentence(String s) {
        int k=0,n=s.length();
        String[] str=new String[n];
        String s2="";
        for(String st:s.split(" "))
        {
            char ch=st.charAt(st.length()-1);
            int a=Integer.parseInt(ch+"");
            str[a-1]=st.substring(0,st.length()-1);
            
        }
        for(String s1:str)
        {
            if(s1!=null)
            {s2=s2+s1+" ";}
        }
        return s2.substring(0,s2.length()-1);
    }
}