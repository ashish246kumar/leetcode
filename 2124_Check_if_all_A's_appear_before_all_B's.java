class Solution {
    public boolean checkString(String s) {
        int c=0,d=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                if(d!=0)
                {
                    return false;
                }
                c=c+1;
            }
            else{
                d=d+1;
            }
        }
        return true;
    }
}